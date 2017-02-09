package com.example.brsoft.retrofitdemo;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.example.brsoft.retrofitdemo.restclient.ApiHitListener;
import com.example.brsoft.retrofitdemo.restclient.ApiIds;
import com.example.brsoft.retrofitdemo.restclient.RestClient;
import com.example.brsoft.retrofitdemo.restclient.RetrofitUtils;

import java.io.IOException;
import java.util.ArrayList;

import gun0912.tedbottompicker.TedBottomPicker;

public class MainActivity extends AppCompatActivity implements View.OnClickListener,ApiHitListener {
    Button btn_get,btn_post,btn_post_image;
    private ProgressDialog mLoadingDialog;
    private AlertDialog mErrorDialog;
    RestClient restClient;
    ImageView iv_profile;
    private int reqCode;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews() {
        restClient=new RestClient(this);
        btn_get=(Button)findViewById(R.id.btn_get);
        btn_post=(Button)findViewById(R.id.btn_post);
        btn_post_image=(Button)findViewById(R.id.btn_post_image);

        btn_get.setOnClickListener(this);
        btn_post.setOnClickListener(this);
        btn_post_image.setOnClickListener(this);
        iv_profile=(ImageView)findViewById(R.id.iv_profile);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_get:
                createGetRequest();
                break;
            case R.id.btn_post:
                createPostRequest();
                break;
            case R.id.btn_post_image:
                if (checkPermissions(new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE,
                        Manifest.permission.CAMERA,
                        Manifest.permission.READ_EXTERNAL_STORAGE}, 99)) {
                    pickImage();
                }
                break;
        }
    }

    public void pickImage(){

        TedBottomPicker tedBottomPicker = new TedBottomPicker.Builder(this)
                .setOnImageSelectedListener(new TedBottomPicker.OnImageSelectedListener() {
                    @Override
                    public void onImageSelected(Uri uri) {
                        // here is selected uri
                        Log.e("path",""+uri.getEncodedPath());
                        try {
                            Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                            iv_profile.setImageBitmap(bitmap);
                            uploadImageRequest(uri.getEncodedPath());
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                })
                .create();

        tedBottomPicker.show(getSupportFragmentManager());
    }

    private void uploadImageRequest(String path) {

        Utils.hideKeyboard(this);
        if (Utils.isNetAvail(this)) {
            displayLoadingDialog(true);

            String email= "jasvant@gmail.com";
            String password="123456";

            restClient.callback(this).uploadPhotoProcess(email,password, RetrofitUtils.createFilePart("image",path, RetrofitUtils.MEDIA_TYPE_IMAGE_PNG));
        } else {
            displayErrorDialog("Error", "No internet available");

        }
    }

    private void createPostRequest() {

        Utils.hideKeyboard(this);
        if (Utils.isNetAvail(this)) {
            displayLoadingDialog(true);

            restClient.callback(this).PostProcess("jasvant@gmail.com", "123456", "N", "jkhdfkjah");
        } else {
            displayErrorDialog("error", "network not available");

        }

    }

    private void createGetRequest() {

        Utils.hideKeyboard(this);
        if (Utils.isNetAvail(this)) {
            displayLoadingDialog(true);

            restClient.callback(this).GetProcess();
        } else {
            displayErrorDialog("error", "network not available");

        }
    }

    public boolean checkPermissions(String[] perms, int requestCode) {
        this.reqCode = requestCode;
        ArrayList<String> permsArray = new ArrayList<>();
        boolean hasPerms = true;
        for (String perm : perms) {
            if (ContextCompat.checkSelfPermission(this, perm) != PackageManager.PERMISSION_GRANTED) {
                permsArray.add(perm);
                hasPerms = false;
            }
        }
        if (!hasPerms) {
            String[] permsString = new String[permsArray.size()];
            for (int i = 0; i < permsArray.size(); i++) {
                permsString[i] = permsArray.get(i);
            }
            ActivityCompat.requestPermissions(this, permsString, 99);
            return false;
        } else
            return true;
    }




    public void displayLoadingDialog(boolean isCancellable) {
        mLoadingDialog = new ProgressDialog(this);
        mLoadingDialog.setTitle("Loading");
        mLoadingDialog.setMessage("please wait...");
        mLoadingDialog.setIndeterminate(true);
        mLoadingDialog.setCancelable(isCancellable);
        mLoadingDialog.show();
    }

    public void dismissLoadingDialog() {
        if (mLoadingDialog != null) {
            mLoadingDialog.dismiss();
        }
    }

    public void displayErrorDialog(String title, String content) {
        mErrorDialog = new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(content)
                .setCancelable(false)
                .setNegativeButton("dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .create();
        mErrorDialog.show();
    }

    public void displayResponseDialog(String title, String content) {
        mErrorDialog = new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(content)
                .setCancelable(false)
                .setNegativeButton("dismiss", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .create();
        mErrorDialog.show();
    }


    @Override
    public void onSuccessResponse(int apiId, Object response) {
        dismissLoadingDialog();
        if (apiId == ApiIds.ID_POST_PROCESS) {
            DemoPostResponseModel Model = (DemoPostResponseModel) response;

            if (Model.getCode() == 0) {

                //successful response
                displayResponseDialog("Response :",Model.getData().getFirstname());

            }else{
                displayErrorDialog("Error",Model.getMessage());
            }
        }else if (apiId == ApiIds.ID_GET_PROCESS) {
            DemoGetResponseModel Model = (DemoGetResponseModel) response;
            if (Model.getCode() == 0) {

                //successful response
                displayResponseDialog("Response :",Model.getData().get(1).getCountry());

            }else{
                displayErrorDialog("Error",Model.getMessage());
            }
        }else if (apiId == ApiIds.ID_UPLOAD_IMAGE_PROCESS) {
            DemoUploadPhotoModel Model = (DemoUploadPhotoModel) response;
            if (Model.getCode() == 0) {

                //successful response
                displayResponseDialog("Response :",Model.getMessage());

            }else{
                displayErrorDialog("Error",Model.getMessage());
            }
        }

        }

    @Override
    public void onFailResponse(int apiId, String error) {
        dismissLoadingDialog();
        displayErrorDialog("Error", error);
    }
}
