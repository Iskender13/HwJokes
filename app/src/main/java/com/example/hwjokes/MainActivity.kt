package com.example.hwjokes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.hwjokes.databinding.ActivityMainBinding
import com.example.hwjokes.retrofit.Jokes
import com.example.hwjokes.retrofit.RetrofitJokes
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding=ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        clicker()
    }

    private fun clicker() {
        with(binding){
            btn.setOnClickListener {
                RetrofitJokes.api.getJokes(et.text.toString()).enqueue(object :Callback<Jokes>{
                    override fun onResponse(call: Call<Jokes>, response: Response<Jokes>) {
                        setup.text=response.body().toString()
                        punchline.text=response.body().toString()
                    }

                    override fun onFailure(call: Call<Jokes>, t: Throwable) {
                        setup.text=t.message
                        punchline.text=t.message

                    }
                })
            }
        }
    }

}