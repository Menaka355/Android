package com.example.momscare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ClinicDates : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clinic_dates)


        val button_text=findViewById<Button>(R.id.btn)
        button_text.setOnClickListener {
            val intent = Intent(this, ClinicDatesUpdater2::class.java)
            startActivity(intent)
        }
    }
}