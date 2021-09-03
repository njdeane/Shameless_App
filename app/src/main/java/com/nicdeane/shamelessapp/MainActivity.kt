package com.nicdeane.shamelessapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val previewButton = findViewById<Button>(R.id.button_preview)
        previewButton.setOnClickListener {
            onPreviewClicked()
        }

    }

    private fun onPreviewClicked() {
        val contactName = findViewById<TextInputEditText>(R.id.edit_text_contact_name)
        val contactNumber = findViewById<TextInputEditText>(R.id.edit_text_contact_number)
        val testString = contactName.text.toString() + ", " + contactNumber.text.toString()
        Toast.makeText(this, testString, Toast.LENGTH_LONG).show()
    }


}