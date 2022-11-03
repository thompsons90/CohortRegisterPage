package com.example.registerpage

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

var submit: Button = findViewById(R.id.button)
        submit.setOnClickListener {
            Toast.makeText(this, "Testing Button", Toast.LENGTH_LONG).show()
        }
    }

}