package com.example.momscare

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ClinicDatesUpdater : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clinic_dates_updater)

        val button_text1 =findViewById<Button>(R.id.btn1)
        button_text1.setOnClickListener {
            val intent= Intent(this,ClinicDates::class.java)
            startActivity(intent)

        }
    }
}