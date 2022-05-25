package com.example.imageactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnWatch : Button

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnWatch = findViewById(R.id.btnWatch)

        btnWatch.setOnClickListener {
            val intent = Intent(this,nextActivity::class.java)
            startActivity(intent)
        }
    }
}