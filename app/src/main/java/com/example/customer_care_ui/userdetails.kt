package com.example.customer_care_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import apiInterface
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import kotlin.text.StringBuilder




class userdetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_userdetails)


        val activatebutton = findViewById<Button>(R.id.button2)
        activatebutton.setOnClickListener {
            val Intent = Intent(this, activatepackage::class.java)
            startActivity(Intent)




        }
    }
}









