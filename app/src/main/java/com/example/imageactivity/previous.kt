package com.example.imageactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class previous : AppCompatActivity() {
    lateinit var btnGonext: Button
    lateinit var btnGoback: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_previous)

        btnGonext = findViewById(R.id.btnGonext)
        btnGoback = findViewById(R.id.btnGoback)

        btnGonext.setOnClickListener {
            val intent = Intent(this, fifth::class.java)
            startActivity(intent)

        }
        btnGoback.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}

