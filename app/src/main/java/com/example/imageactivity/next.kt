package com.example.imageactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import java.util.prefs.BackingStoreException

class next : AppCompatActivity() {
    lateinit var btnNext : Button
    lateinit var btnBack: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next3)

        btnNext = findViewById(R.id.btnNext)
        btnBack = findViewById(R.id.btnBack)

        btnNext.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

    }
        btnBack.setOnClickListener {
            val intent = Intent(this, previous::class.java)
            startActivity(intent)
}
        }
    }