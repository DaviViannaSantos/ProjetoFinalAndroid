package com.DaviVianna.harrypotter.data.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    private const val BASE_URL = "https://hp-api.onrender.com/api/"

    val apiService: HpApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create()) // ESSENCIAL para converter o JSON
            .build()
            .create(HpApiService::class.java)
    }
}