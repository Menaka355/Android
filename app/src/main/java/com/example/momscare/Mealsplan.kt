package com.example.momscare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Mealsplan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mealsplan)

        // Find the button by its ID
        val nextButton = findViewById<Button>(R.id.button4)

        // Set an OnClickListener to navigate to MealsP2 activity when clicked
        nextButton.setOnClickListener {
            val intent = Intent(this, MealsP2::class.java)
            startActivity(intent)
        }
    }
}
