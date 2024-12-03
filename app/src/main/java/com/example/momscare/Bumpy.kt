package com.example.momscare

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class Bumpy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bumpy)


        val tvCurrentWeek: TextView = findViewById(R.id.tvCurrentWeek)
        val tvDaysLeft: TextView = findViewById(R.id.tvDaysLeft)
        val tvDeliveryDate: TextView = findViewById(R.id.tvDeliveryDate)

        // Set the last menstrual period (LMP) date
        val lmpDate = Calendar.getInstance().apply {
            set(2024, Calendar.JANUARY, 1) // Example LMP date: January 1, 2024
        }
// Calculate expected delivery date (EDD) - 40 weeks from LMP
        val eddDate = lmpDate.clone() as Calendar
        eddDate.add(Calendar.WEEK_OF_YEAR, 40)

        // Get the current date
        val currentDate = Calendar.getInstance()

        // Calculate weeks passed since LMP
        val weeksPassed = (currentDate.timeInMillis - lmpDate.timeInMillis) / (7 * 24 * 60 * 60 * 1000)

        // Calculate days left until EDD
        val daysLeft = (eddDate.timeInMillis - currentDate.timeInMillis) / (24 * 60 * 60 * 1000)

        // Display the results
        tvCurrentWeek.text = "Current Week: $weeksPassed"
        tvDaysLeft.text = "Days Left: $daysLeft"
        tvDeliveryDate.text = "Expected Delivery Date: ${SimpleDateFormat("dd MMM yyyy", Locale.getDefault()).format(eddDate.time)}"
    }
}
