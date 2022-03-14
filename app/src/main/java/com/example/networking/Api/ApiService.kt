package com.example.networking.Api

import com.example.networking.Model.Data
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

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

}