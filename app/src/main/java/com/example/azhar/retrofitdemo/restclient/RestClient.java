package com.example.azhar.retrofitdemo.restclient;

import android.content.Context;

import com.example.azhar.retrofitdemo.DemoGetResponseModel;
import com.example.azhar.retrofitdemo.DemoPostResponseModel;
import com.example.brsoft.retrofitdemo.DemoUploadPhotoModel;
import com.example.azhar.retrofitdemo.retrofit.Rest;
import com.example.azhar.retrofitdemo.retrofit.RestService;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ububtu on 13/7/16.
 */
public class RestClient extends BaseRestClient {
    ApiHitListener apiHitListener;
    private Rest api;
    private Object object;

    public RestClient(Context _context) {
        super(_context);
    }

    public RestClient callback(ApiHitListener apiHitListener) {
        this.apiHitListener = apiHitListener;
        return this;
    }

    private Rest getApi() {
        if (api == null) {
            api = RestService.getService();
        }

        return api;
    }


    public void PostProcess(String fname, String lname, String email, String password) {
        Call<DemoPostResponseModel> call = getApi().PostProcess(fname, lname, email, password);
        call.enqueue(new Callback<DemoPostResponseModel>() {
            @Override
            public void onResponse(Call<DemoPostResponseModel> call, Response<DemoPostResponseModel> response) {
                apiHitListener.onSuccessResponse(ApiIds.ID_POST_PROCESS, response.body());
            }

            @Override
            public void onFailure(Call<DemoPostResponseModel> call, Throwable t) {
                apiHitListener.onFailResponse(ApiIds.ID_POST_PROCESS, t.getMessage());

            }
        });


    }
 public void GetProcess() {
        Call<DemoGetResponseModel> call = getApi().GetProcess();
        call.enqueue(new Callback<DemoGetResponseModel>() {
            @Override
            public void onResponse(Call<DemoGetResponseModel> call, Response<DemoGetResponseModel> response) {
                apiHitListener.onSuccessResponse(ApiIds.ID_GET_PROCESS, response.body());
            }

            @Override
            public void onFailure(Call<DemoGetResponseModel> call, Throwable t) {
                apiHitListener.onFailResponse(ApiIds.ID_GET_PROCESS, t.getMessage());

            }
        });
    }

    public void uploadPhotoProcess(String email, String pass, MultipartBody.Part file) {
        Call<DemoUploadPhotoModel> call = getApi().uploadPhotoProcess(AuthUtils.basic(email, pass), file);
        call.enqueue(new Callback<DemoUploadPhotoModel>() {
            @Override
            public void onResponse(Call<DemoUploadPhotoModel> call, Response<DemoUploadPhotoModel> response) {
                apiHitListener.onSuccessResponse(ApiIds.ID_UPLOAD_IMAGE_PROCESS, response.body());
            }

            @Override
            public void onFailure(Call<DemoUploadPhotoModel> call, Throwable t) {
                apiHitListener.onFailResponse(ApiIds.ID_UPLOAD_IMAGE_PROCESS, t.getMessage());

            }
        });

    }



}