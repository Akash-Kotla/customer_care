package com.example.customer_care_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class customer_support : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_customer_support)

       val imageButton:ImageButton=findViewById(R.id.imageButton)
        imageButton.setOnClickListener {
            startActivity(Intent(this,userdetails::class.java))
        }

    }
}