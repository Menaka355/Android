package com.example.momscare

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Vaccines : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vaccines)

        // Handle button click to navigate to VaccinesOptions
        val buttonGoToVaccines = findViewById<Button>(R.id.button3)
        buttonGoToVaccines.setOnClickListener {
            // Create an Intent to start the VaccinesOptions activity
            val intent = Intent(this, VaccinesOptions::class.java)
            startActivity(intent)
        }

        // Simulate vaccine status
        val vaccineCompleted = true // Change this value to false to simulate needing a vaccine

        val vaccineStatusTextView = findViewById<TextView>(R.id.vaccineStatus)
        if (vaccineCompleted) {
            vaccineStatusTextView.text = "Vaccination Completed"
            vaccineStatusTextView.setTextColor(Color.GREEN)
        } else {
            vaccineStatusTextView.text = "Vaccination Needed"
            vaccineStatusTextView.setTextColor(Color.parseColor("#FFA500")) // Orange color
        }
    }
}
