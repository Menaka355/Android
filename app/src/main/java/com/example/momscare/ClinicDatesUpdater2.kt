package com.example.momscare

import android.os.Bundle
import android.widget.Button
import android.widget.NumberPicker
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ClinicDatesUpdater2 : AppCompatActivity() {
    private lateinit var numPickerMin: NumberPicker
    private lateinit var numPickerSec: NumberPicker
    private lateinit var amPmPicker: NumberPicker
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clinic_dates_updater2)

        // Initialize the NumberPickers
        numPickerMin = findViewById(R.id.numPickerMin)
        numPickerSec = findViewById(R.id.numPickerSec)
        amPmPicker = findViewById(R.id.amPmPicker)
        button = findViewById(R.id.button)

        // Set number picker ranges
        numPickerMin.minValue = 1
        numPickerMin.maxValue = 12

        numPickerSec.minValue = 0
        numPickerSec.maxValue = 59

        val amPmValues = arrayOf("AM", "PM")
        amPmPicker.displayedValues = amPmValues
        amPmPicker.minValue = 0
        amPmPicker.maxValue = amPmValues.size - 1

        // Set OnClickListener for the button
        button.setOnClickListener {
            val selectedHour = numPickerMin.value
            val selectedMinute = numPickerSec.value
            val selectedAmPm = amPmValues[amPmPicker.value]

            // Display the selected values as a Toast message
            val result = "Selected Time: $selectedHour:$selectedMinute $selectedAmPm"
            Toast.makeText(this, result, Toast.LENGTH_LONG).show()

            // You can replace the Toast with other actions, such as displaying in a TextView
        }
    }
}
