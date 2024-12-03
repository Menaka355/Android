package com.example.momscare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MyVaccinesdates : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_vaccinesdates)

        // Find the buttons by their IDs
        val button16 = findViewById<Button>(R.id.button16)
        val button17 = findViewById<Button>(R.id.button17)

        // Set click listeners
        button16.setOnClickListener {
            // Navigate to the AbouttheVaccines activity
            val intent = Intent(this, AbouttheVaccines::class.java)
            startActivity(intent)
        }

        button17.setOnClickListener {
            // Navigate to the VaccinesOptions activity
            val intent = Intent(this, VaccinesOptions::class.java)
            startActivity(intent)
        }
    }
}
