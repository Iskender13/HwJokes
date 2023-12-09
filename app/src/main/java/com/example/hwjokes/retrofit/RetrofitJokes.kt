package com.example.hwjokes.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitJokes {
    //https://dad-jokes.p.rapidapi.com/random/joke
    val retrofit= Retrofit.Builder().baseUrl("https://dad-jokes.p.rapidapi.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()
    val api=retrofit.create(JokesApi::class.java)




}