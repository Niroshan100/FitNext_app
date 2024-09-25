package com.example.fitnext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class signup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        val btn = findViewById<ImageButton>(R.id.imageButton3)
        btn.setOnClickListener(){
            val inten = Intent(this, dashbord::class.java)
            startActivity(inten)
        }

        val btn2 = findViewById<ImageButton>(R.id.imageButton6)
        btn2.setOnClickListener(){
            val inten = Intent(this, login::class.java)
            startActivity(inten)
        }
    }
}