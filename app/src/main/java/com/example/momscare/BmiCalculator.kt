package com.example.momscare

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class BmiCalculator : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bmi_calculator)

        val heightEditText = findViewById<EditText>(R.id.height_edit_text)
        val weightEditText = findViewById<EditText>(R.id.weight_edit_text)
        val calculateButton = findViewById<Button>(R.id.calculate_button)
        val bmiResultTextView = findViewById<TextView>(R.id.bmi_result_text_view)

        calculateButton.setOnClickListener {
            val heightStr = heightEditText.text.toString()
            val weightStr = weightEditText.text.toString()

            if (heightStr.isNotEmpty() && weightStr.isNotEmpty()) {
                val height = heightStr.toFloat() / 100 // Convert to meters
                val weight = weightStr.toFloat()
                val bmi = weight / (height * height)

                val bmiResult = when {
                    bmi < 18.5 -> "Underweight: $bmi"
                    bmi < 24.9 -> "Normal weight: $bmi"
                    bmi < 29.9 -> "Overweight: $bmi"
                    else -> "Obese: $bmi"
                }

                bmiResultTextView.text = bmiResult
            }
        }
    }
}






