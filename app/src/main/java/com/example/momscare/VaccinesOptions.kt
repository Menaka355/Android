package com.example.momscare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class VaccinesOptions : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaccines_options)


// Find the "My Vaccine Date" button
        val myVaccineDateButton: Button = findViewById(R.id.button9)
        // Set onClickListener to navigate to MyVaccinesdates activity
        myVaccineDateButton.setOnClickListener {
            val intent = Intent(this, MyVaccinesdates::class.java)
            startActivity(intent)
        }

        // Find the "About the Vaccines" button
        val aboutTheVaccinesButton: Button = findViewById(R.id.button10)
        // Set onClickListener to navigate to AbouttheVaccines activity
        aboutTheVaccinesButton.setOnClickListener {
            val intent = Intent(this, MyVaccinesdates::class.java)
            startActivity(intent)
        }
    }



}