package com.example.momscare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MealsP4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meals_p4)

        // Find the button by its ID
        val button4 = findViewById<Button>(R.id.button4)

        // Set an OnClickListener to the button
        button4.setOnClickListener {
            // Create an Intent to start the  Home
            val intent = Intent(this,Home::class.java)
            startActivity(intent)
        }
    }
}
