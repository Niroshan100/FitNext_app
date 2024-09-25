package com.example.fitnext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class onboarding1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding1)

        val btn = findViewById<ImageButton>(R.id.imageButton)
        btn.setOnClickListener(){
            val inten = Intent(this, onboarding2::class.java)
            startActivity(inten)
        }
    }
}