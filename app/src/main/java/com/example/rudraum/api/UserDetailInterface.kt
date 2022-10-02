package com.example.rudraum.api

import com.example.rudraum.model.RegisterResponceModel
import retrofit2.Response
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part
import retrofit2.http.Query

interface UserDetailInterface {

    //register
    @Multipart
    @POST("/keys-api.php")
    fun registerUser(
        @Query("p") action: String,
        @Part("name") name: String,
        @Part("gst_name") gst_name: String,
        @Part("gst_no") gst_no: String,
        @Part("mobile") mobile: String,
        @Part("password") password: String,
        @Part("parent_id") parent_id: String,
    ): Response<RegisterResponceModel>

    //login
    @Multipart
    @POST("/keys-api.php")
    fun loginUser(
        @Query("p") action: String,
        @Part("mobile") mobile: String,
        @Part("password") password: String,
        @Part("token") token: String,
    ): Response<RegisterResponceModel>
}