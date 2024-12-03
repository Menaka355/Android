package com.example.momscare

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class CreateAccountPage : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_account_page)

        val firstNameEditText = findViewById<EditText>(R.id.first_name_edit_text)
        val lastNameEditText = findViewById<EditText>(R.id.last_name_edit_text)
        val contactNumberEditText = findViewById<EditText>(R.id.contact_number_edit_text)
        val signUpButton = findViewById<Button>(R.id.sign_up_button)
        val signInTextView = findViewById<TextView>(R.id.signUpTextView)

        signUpButton.setOnClickListener {
            val firstName = firstNameEditText.text.toString().trim()
            val lastName = lastNameEditText.text.toString().trim()
            val contactNumber = contactNumberEditText.text.toString().trim()

            if (firstName.isEmpty()) {
                firstNameEditText.error = "First Name is required"
                firstNameEditText.requestFocus()
                return@setOnClickListener
            }
            if (lastName.isEmpty()) {
                lastNameEditText.error = "Last Name is required"
                lastNameEditText.requestFocus()
                return@setOnClickListener
            }
            if (contactNumber.isEmpty()) {
                contactNumberEditText.error = "Contact Number is required"
                contactNumberEditText.requestFocus()
                return@setOnClickListener
            }

            navigateToSignUp(firstName, lastName, contactNumber)
        }

        // Navigate to Sign-In page when the user clicks the TextView
        signInTextView.setOnClickListener {
            navigateToSignIn()
        }
    }

    private fun navigateToSignUp(firstName: String, lastName: String, contactNumber: String) {
        val intent = Intent(this, SignUpActivity::class.java).apply {
            putExtra("FIRST_NAME", firstName)
            putExtra("LAST_NAME", lastName)
            putExtra("CONTACT_NUMBER", contactNumber)
        }
        startActivity(intent)
    }

    private fun navigateToSignIn() {
        val intent = Intent(this, SignInActivity::class.java)
        startActivity(intent)
    }
}
