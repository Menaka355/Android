package com.example.momscare

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity

class AbouttheVaccines : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_aboutthe_vaccines)

        // Find the Spinner by its ID
        val vaccineDetailsSpinner = findViewById<Spinner>(R.id.vaccineDetailsSpinner)

        // Array of vaccine details
        val vaccineDetails = arrayOf(
            "What: The Tetanus Toxoid vaccine prevents tetanus infection.",
            "Who: It's recommended for everyone, including pregnant women.",
            "Why: Tetanus is a serious infection that can be deadly, especially for newborns.",
            "When: Pregnant women should get it early in pregnancy, with additional doses as advised by healthcare providers.",
            "How: The vaccine triggers the immune system to produce antibodies against tetanus.",
            "Effectiveness: It's highly effective and provides long-lasting protection.",
            "Safety: It's considered safe during pregnancy and has been used for years without major concerns."
        )

        // Create an ArrayAdapter using the string array and a default spinner layout
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, vaccineDetails)

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        // Apply the adapter to the spinner
        vaccineDetailsSpinner.adapter = adapter

        // Find the button by its ID
        val backButton = findViewById<Button>(R.id.button11)

        // Set a click listener on the button
        backButton.setOnClickListener {
            // Create an Intent to navigate back to MyVaccinesdates activity
            val intent = Intent(this, MyVaccinesdates::class.java)
            startActivity(intent)
        }
    }
}
