package com.example.momscare

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class MealsP2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meals_p2)

        // Find the button by ID
        val nextButton: Button = findViewById(R.id.button4)

        // Set up the click listener for the button
        nextButton.setOnClickListener {
            // Create an Intent to start the MealsP3 activity
            val intent = Intent(this, MealsP3::class.java)
            startActivity(intent)
        }

        // Find the Spinner by ID
        val foodHabitsSpinner: Spinner = findViewById(R.id.food_habits_spinner)

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this,
            R.array.food_habits_array,
            android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            foodHabitsSpinner.adapter = adapter
        }

        // Set up a listener for the spinner (optional)
        foodHabitsSpinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
                // Handle item selection
                val selectedItem = parent.getItemAtPosition(position).toString()
                // You can add actions based on the selected item
            }

            override fun onNothingSelected(parent: AdapterView<*>) {
                // Handle no selection
            }
        }
    }
}
