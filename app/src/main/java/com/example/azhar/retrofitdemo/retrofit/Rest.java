package com.example.brsoft.retrofitdemo.retrofit;


import com.example.brsoft.retrofitdemo.DemoGetResponseModel;
import com.example.brsoft.retrofitdemo.DemoPostResponseModel;
import com.example.brsoft.retrofitdemo.DemoUploadPhotoModel;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;


public interface Rest {


    @FormUrlEncoded
    @POST("userlogin")
    Call<DemoPostResponseModel> PostProcess(@Field("email") String email,
                                            @Field("password") String password,
                                            @Field("loginfrom") String loginfrom,
                                            @Field("device_token") String device_token);



    @GET("getcountry")
    Call<DemoGetResponseModel> GetProcess();


    @Multipart
    @POST("update_photo")
    Call<DemoUploadPhotoModel> uploadPhotoProcess(@Header("Authorization") String authorization,
                                                  @Part MultipartBody.Part file);




}
