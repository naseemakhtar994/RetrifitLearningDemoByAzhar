package com.example.brsoft.retrofitdemo.restclient;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Toast;




/**
 * Created by ububtu on 13/7/16.
 */
public class BaseRestClient {
    private final Context _context;
    private ProgressDialog pDialog;
    private String pDialogMessage = "Loading...";

    private AlertDialog mErrorDialog;

    protected BaseRestClient(Context _context) {
        this._context = _context;

        init();

    }

    private void init() {
        pDialog = new ProgressDialog(_context);
        pDialog.setMessage(pDialogMessage);
        pDialog.setCancelable(false);


    }


    /**
     * progress dialog functions
     **/
    public void showProgDialog() {
        pDialog.show();
    }

    public void showProgDialog(String message) {

        pDialog.setMessage(message);
        pDialog.show();
    }

    public void hideProgDialog() {
        if (pDialog != null && pDialog.isShowing()) {
            pDialog.dismiss();
        }
    }

    public void showToast(String msg) {
        Toast.makeText(_context, msg, Toast.LENGTH_SHORT).show();
    }


   /* public void showErrorSnackBar(View view, String message) {
        bar = Snackbar.make(view, message, Snackbar.LENGTH_LONG)
                .setAction("OK", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        bar.dismiss();
                    }
                });

        bar.show();
        bar.setActionTextColor(Color.BLUE);
    }

    public void displayErrorDialog(String title, String content) {
        mErrorDialog = new AlertDialog.Builder(_context)
                .setTitle(title)
                .setMessage(content)
                .setIcon(ContextCompat.getDrawable(_context, com.brsoftech.core_utils.R.drawable.ic_error_24dp))
                .setCancelable(false)
                .setNegativeButton(com.brsoftech.core_utils.R.string.dismiss, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                })
                .create();
        mErrorDialog.show();
    }*/


}
