package com.example.fitnext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class notification : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        val btn1 = findViewById<ImageButton>(R.id.imageButton10)
        btn1.setOnClickListener(){
            val inten = Intent(this, dashbord::class.java)
            startActivity(inten)
        }

        val btn2 = findViewById<ImageButton>(R.id.imageButton10)
        btn2.setOnClickListener(){
            val inten = Intent(this, notification::class.java)
            startActivity(inten)
        }

        val btn3 = findViewById<ImageButton>(R.id.imageButton)
        btn3.setOnClickListener(){
            val inten = Intent(this, profile::class.java)
            startActivity(inten)
        }
    }
}