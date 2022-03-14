package com.example.networking

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.networking.Api.ApiClient
import com.example.networking.Api.ApiService
import com.example.networking.Model.Data
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var apiService: ApiService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        apiService = ApiClient.createService(ApiService::class.java)

        //getKey("5881028")
        //getMinMax(0,0.1)
        //initViews()
    }

    fun initViews(){
        apiService.getActivity().enqueue(object : Callback<Data> {
            override fun onResponse(call: Call<Data>, response: Response<Data>) {
                Log.d("@@@", "onResponse: ${response.body()}")
            }

            override fun onFailure(call: Call<Data>, t: Throwable) {
                Log.d("@@@", "onFailure: ${t.localizedMessage!!}")
            }

        })
    }
    fun getKey(key:String){
        apiService.getKey(key).enqueue(object : Callback<Data>{
            override fun onResponse(call: Call<Data>, response: Response<Data>) {
                Log.d("@@@", "onResponse: ${response.body()}")
            }

            override fun onFailure(call: Call<Data>, t: Throwable) {
                Log.d("@@@", "onFailure: ${t.localizedMessage!!}")
            }

        })
    }
    fun getMinMax(minPrice:Int,maxPrice:Double){
        apiService.getMaxMin(minPrice,maxPrice).enqueue(object : Callback<Data>{
            override fun onResponse(call: Call<Data>, response: Response<Data>) {
                Log.d("@@@", "onResponse: ${response.body()}")
            }

            override fun onFailure(call: Call<Data>, t: Throwable) {
                Log.d("@@@", "onFailure: ${t.localizedMessage!!}")
            }

        })
    }

    fun createPost(title:String,body:String){
        val map = HashMap<String,Any>()
        map["title"] = title
        map["body"] = body
        apiService.createPost(map).enqueue(object :  {

        })
    }
}