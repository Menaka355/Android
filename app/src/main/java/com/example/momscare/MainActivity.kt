package com.example.momscare

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val button13: Button = findViewById(R.id.button13)
        button13.setOnClickListener {
            val intent = Intent(this, CreateAccountPage::class.java)
            startActivity(intent)
        }

    }
}


