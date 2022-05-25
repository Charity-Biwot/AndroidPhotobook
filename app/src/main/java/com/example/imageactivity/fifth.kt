package com.example.imageactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class fifth : AppCompatActivity() {
    lateinit var btnSec: Button
    lateinit var btnLast: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        btnSec = findViewById(R.id.btnSec)
        btnLast= findViewById(R.id.btnLast)

        btnSec.setOnClickListener {
            val intent = Intent(this, previous::class.java)
            startActivity(intent)

        }
        btnLast.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}



