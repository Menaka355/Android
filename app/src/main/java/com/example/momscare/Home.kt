package com.example.momscare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val bmiCalculatorIntent = Intent(this, BmiCalculator::class.java)
            startActivity(bmiCalculatorIntent)
        }

        val button2 = findViewById<Button>(R.id.button2)
        button2.setOnClickListener {
            val emergencyCallIntent = Intent(this, EmergencyCall::class.java)
            startActivity(emergencyCallIntent)
        }

        val button4 = findViewById<Button>(R.id.button4)
        button4.setOnClickListener {
            val clinicDatesUpdaterIntent = Intent(this, ClinicDatesUpdater::class.java)
            startActivity(clinicDatesUpdaterIntent)
        }

        val button5 = findViewById<Button>(R.id.button5)
        button5.setOnClickListener {
            val foodsHabitsIntent = Intent(this, FoodsHabbits::class.java)
            startActivity(foodsHabitsIntent)
        }

        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener {
            val vaccinesIntent = Intent(this, Vaccines::class.java)
            startActivity(vaccinesIntent)
        }

        // Handle click for button3 (Bumpy)
        val button3 = findViewById<Button>(R.id.button3)
        button3.setOnClickListener {
            val bumpyIntent = Intent(this, Bumpy::class.java)
            startActivity(bumpyIntent)
        }
    }
}