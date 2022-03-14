package com.example.networking.Api

import com.example.networking.Model.Data
import com.example.networking.Model.Post
import retrofit2.Call
import retrofit2.http.*

interface ApiService {

    @GET("activity")
    fun getActivity(): Call<Data>

    @GET("activity")
    fun getKey(@Query("key")key:String):Call<Data>

    @GET("activity")
    fun getMaxMin(@Query("minprice")minprice:Int,
                  @Query("maxprice")maxPrice:Double
    ):Call<Data>

    @GET("posts/{id}")
    fun getPhoto(@Path("id")postId:Int):Call<Post>

    @POST("posts")
    fun createPost(@Body map:HashMap<String,Any>):Call<Post>

}