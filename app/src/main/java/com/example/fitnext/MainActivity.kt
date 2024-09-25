package com.example.fitnext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<ImageButton>(R.id.imageButton2)
        btn.setOnClickListener(){
            val inten = Intent(this, onboarding1::class.java)
            startActivity(inten)
        }
    }
}