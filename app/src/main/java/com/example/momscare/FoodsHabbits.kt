package com.example.momscare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class FoodsHabbits : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_foods_habbits)

        // Find the button by its ID
        val mealsPlanButton = findViewById<Button>(R.id.button8)

        // Set an OnClickListener to handle the click event
        mealsPlanButton.setOnClickListener {
            // Create an Intent to start the Mealsplan activity
            val intent = Intent(this, Mealsplan::class.java)
            startActivity(intent)
        }
    }
}
