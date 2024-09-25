package com.example.fitnext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class onboarding3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding3)

        val btn = findViewById<ImageButton>(R.id.imageButton)
        btn.setOnClickListener(){
            val inten = Intent(this, signup::class.java)
            startActivity(inten)
        }
    }
}