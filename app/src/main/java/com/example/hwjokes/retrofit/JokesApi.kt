package com.example.hwjokes.retrofit

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface JokesApi {
    @GET("/random/joke HTTP/1.1")
    public fun getJokes(@Query("type") type: String,
                        @Header("X-RapidAPI-Key")
                        key : String="adb0bdc4e8msh4e7ba6972056bc5p16ba26jsn8364cfff0d4e",
                        @Header("X-RapidAPI-Host") host : String="dad-jokes.p.rapidapi.com"):Call<Jokes>
}