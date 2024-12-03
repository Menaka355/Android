package com.example.momscare

import CreateAccountwithPregnancyDetails
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class SecondWelcomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_welcome_page)

        val button = findViewById<Button>(R.id.button12)
        button.setOnClickListener {
            val intent = Intent(this, CreateAccountwithPregnancyDetails::class.java)
            startActivity(intent)


        }
    }
}
