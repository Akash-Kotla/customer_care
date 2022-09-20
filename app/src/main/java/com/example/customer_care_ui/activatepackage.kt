package com.example.customer_care_ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.core.content.ContentProviderCompat.requireContext

class activatepackage : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_activatepackage)

        val packs = resources.getStringArray(R.array.Packages)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item,packs)
        val autocomplete = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        autocomplete.setAdapter(arrayAdapter)

        val courses = resources.getStringArray(R.array.course)
        val courseadapter= ArrayAdapter(this,R.layout.dropdown_item,courses)
        val autoComplete1 = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView1)
        autoComplete1.setAdapter(courseadapter)


    }
}