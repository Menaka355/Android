package com.example.momscare

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EmergencyCall : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emergency_call)

        // Get reference to the button
        val callButton: Button = findViewById(R.id.button7)

        // Set click listener to the button
        callButton.setOnClickListener {
            // Create an intent to open the dialer with the number 1990
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:1990")
            startActivity(dialIntent)
        }
    }
}
