package com.example.screensmart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import vcmsa.ci.a2024guide.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Find views using findViewById
        val btnViewDetails = findViewById<View>(R.id.btnViewDetails)
        val btnClearData = findViewById<View>(R.id.btnClearData)
        val txtMorningTime = findViewById<EditText>(R.id.txtMorningTime)
        val txtAfternoonTime = findViewById<EditText>(R.id.txtAfternoonTime)
        val txtActivityNotes = findViewById<EditText>(R.id.txtActivityNotes)

        // Button click listeners
        btnViewDetails.setOnClickListener {
            val intent = Intent(this, DetailedViewActivity::class.java)
            startActivity(intent)
        }

        btnClearData.setOnClickListener {
            // Logic to clear data
            txtMorningTime.text.clear()
            txtAfternoonTime.text.clear()
            txtActivityNotes.text.clear()
        }
    }
}