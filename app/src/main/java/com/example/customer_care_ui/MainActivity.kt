package com.example.customer_care_ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowManager
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN)
        setContentView(R.layout.activity_main)

        val secondactbutton = findViewById<Button>(R.id.login)
        secondactbutton.setOnClickListener {
            val Intent = Intent(this, customer_support::class.java)
            startActivity(Intent)


    }

    }
}