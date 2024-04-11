package com.example.greeting_app_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //image

        val image:ImageView=findViewById(R.id.imageView)

        image.setImageResource(R.drawable.greeting)


        val et=findViewById<EditText>(R.id.editText);
        //get input from edit text
        val editTextInput=et.text


        //button
        val btn:Button=findViewById(R.id.btn)
      btn.setOnClickListener {
          Toast.makeText(this,"Hello "+editTextInput+ " welcome!",Toast.LENGTH_SHORT).show()
      }
    }
}