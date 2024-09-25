package com.example.fitnext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class onboarding2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding2)

        val btn = findViewById<ImageButton>(R.id.imageButton)
        btn.setOnClickListener(){
            val inten = Intent(this, onboarding3::class.java)
            startActivity(inten)
        }
    }
}