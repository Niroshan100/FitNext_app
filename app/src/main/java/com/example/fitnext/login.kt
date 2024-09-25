package com.example.fitnext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn1 = findViewById<ImageButton>(R.id.imageButton10)
        btn1.setOnClickListener(){
            val inten = Intent(this, dashbord::class.java)
            startActivity(inten)
        }
    }
}