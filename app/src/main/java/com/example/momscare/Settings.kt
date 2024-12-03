package com.example.momscare

import android.content.res.Configuration
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AppCompatDelegate
import android.widget.RadioButton
import android.widget.Switch
import android.widget.Toast
import java.util.*

class Settings : AppCompatActivity() {

    private lateinit var darkModeSwitch: Switch
    private lateinit var englishRadioButton: RadioButton
    private lateinit var tamilRadioButton: RadioButton
    private lateinit var sinhalaRadioButton: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_settings)

        darkModeSwitch = findViewById(R.id.switch_dark_mode)
        englishRadioButton = findViewById(R.id.radioButton_english)
        tamilRadioButton = findViewById(R.id.radioButton_tamil)
        sinhalaRadioButton = findViewById(R.id.radioButton_sinhala)

        // Handle Dark Mode Toggle
        darkModeSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                // Enable Dark Mode
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
                Toast.makeText(this, "Dark Mode Enabled", Toast.LENGTH_SHORT).show()
            } else {
                // Disable Dark Mode (Light Mode)
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
                Toast.makeText(this, "Light Mode Enabled", Toast.LENGTH_SHORT).show()
            }
        }

        // Handle Language Selection
        englishRadioButton.setOnClickListener {
            setLocale("en")
            Toast.makeText(this, "Language set to English", Toast.LENGTH_SHORT).show()
        }

        tamilRadioButton.setOnClickListener {
            setLocale("ta")
            Toast.makeText(this, "Language set to Tamil", Toast.LENGTH_SHORT).show()
        }

        sinhalaRadioButton.setOnClickListener {
            setLocale("si")
            Toast.makeText(this, "Language set to Sinhala", Toast.LENGTH_SHORT).show()
        }
    }

    // Function to change app language
    private fun setLocale(languageCode: String) {
        val locale = Locale(languageCode)
        Locale.setDefault(locale)
        val config = Configuration()
        config.locale = locale
        resources.updateConfiguration(config, resources.displayMetrics)

        // Restart the activity to apply the language change
        recreate()
    }
}
