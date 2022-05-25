package com.example.imageactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class nextActivity : AppCompatActivity() {
    lateinit var btnGog: Button
    lateinit var btnGog2: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        btnGog= findViewById(R.id.btnGog)
        btnGog2 = findViewById(R.id.btnGog2)


        btnGog2.setOnClickListener {
            val intent = Intent(this, next::class.java)
            startActivity(intent)
        }

          btnGog.setOnClickListener {
              val intent = Intent(this, MainActivity::class.java)
              startActivity(intent)

          }
    }
}