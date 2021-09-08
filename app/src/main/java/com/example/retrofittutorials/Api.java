package com.example.retrofittutorials;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface Api {

    @GET("/posts")
    Call<ResponseBody> getPost();

    @GET("/users")
    Call<ResponseBody> geTUsers();

    @POST("/users")
    Call<ResponseBody> postUser(@Body RequestBody requestBody);

}
