package com.example.azhar.retrofitdemo.restclient;

/**
 * Created by ubuntu on 6/10/16.
 */


import android.support.annotation.NonNull;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;

/**
 * <p><b>Author: Kajal Mittal @ B.R. Softech<b></p>
 * <p>Date: 29/7/16</p>
 * <p>Time: 2:56 PM</p>
 * <p>Project: Planbeep</p>
 */
public class RetrofitUtils {
    public static final String MEDIA_TYPE_MULTIPART_FORM_DATA_VALUE = "multipart/form-data";
    public static final MediaType MEDIA_TYPE_MULTIPART_FORM_DATA = MediaType.parse(MEDIA_TYPE_MULTIPART_FORM_DATA_VALUE);
    private static final String MEDIA_TYPE_ALL_VALUE = "image/*";
    public static final MediaType MEDIA_TYPE_IMAGE_ALL = MediaType.parse(MEDIA_TYPE_ALL_VALUE);
    private static final String MEDIA_TYPE_PNG_VALUE = "image/png";
    public static final MediaType MEDIA_TYPE_IMAGE_PNG = MediaType.parse(MEDIA_TYPE_PNG_VALUE);
    private static final String MEDIA_TYPE_JPG_VALUE = "image/jpg";
    public static final MediaType MEDIA_TYPE_IMAGE_JPG = MediaType.parse(MEDIA_TYPE_JPG_VALUE);
    private static final String MEDIA_TYPE_JPEG_VALUE = "image/jpeg";
    public static final MediaType MEDIA_TYPE_IMAGE_JPEG = MediaType.parse(MEDIA_TYPE_JPEG_VALUE);
    private static final String MEDIA_TYPE_TEXT_PLAIN_VALUE = "text/plain";
    public static final MediaType MEDIA_TYPE_TEXT_PLAIN = MediaType.parse(MEDIA_TYPE_TEXT_PLAIN_VALUE);
   // private static final String MEDIA_TYPE_UNKNOWN_VALUE = "application/octet-stream";
    private static final String MEDIA_TYPE_UNKNOWN_VALUE = "audio/mp3";
   // public static final MediaType MEDIA_TYPE_UNKNOWN = MediaType.parse(MEDIA_TYPE_UNKNOWN_VALUE);
    public static final MediaType MEDIA_TYPE_UNKNOWN = MediaType.parse(MEDIA_TYPE_UNKNOWN_VALUE);
    private static final String MEDIA_TYPE_VIDEO_VALUE = "video/mp4";
    public static final MediaType MEDIA_TYPE_VIDEO = MediaType.parse(MEDIA_TYPE_VIDEO_VALUE);

    @NonNull
    public static RequestBody createPartFromString(String descriptionString) {
        return RequestBody.create(MEDIA_TYPE_MULTIPART_FORM_DATA,
                descriptionString != null ? descriptionString : "");
    }

    public static MultipartBody.Part createFilePart(String variableName, String filePath, MediaType mediaType) {
        File file = new File(filePath);
// create RequestBody instance from file
        RequestBody requestFile =
                RequestBody.create(mediaType, file);
// MultipartBody.Part is used to send also the actual file name
        return MultipartBody.Part.createFormData(variableName, file.getName(), requestFile);
    }

    public static HashMap<String, RequestBody> createMultipartRequest(HashMap<String, String> requestValuePairsMap) {
        HashMap<String, RequestBody> requestMap = new HashMap<>();
        Iterator iterator = requestValuePairsMap.keySet().iterator();
        while (iterator.hasNext()) {
            String key = (String) iterator.next();
            String value = requestValuePairsMap.get(key);
            requestMap.put(key, createPartFromString(value));
        }
        return requestMap;
    }
}
