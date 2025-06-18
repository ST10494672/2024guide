package com.example.screensmart

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import vcmsa.ci.a2024guide.R

class DetailedViewActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        // Find views using findViewById
        val txtDetailedInfo = findViewById<TextView>(R.id.txtDetailedInfo)
        val btnBack = findViewById<TextView>(R.id.btnBack)

        // Example data display
        txtDetailedInfo.text = """
            Day: 2024-04-02
            Morning Screen Time: 30 minutes
            Afternoon Screen Time: 60 minutes
            Activity Notes: Used devices for class and research.
            
            Day: 2024-04-03
            Morning Screen Time: 20 minutes
            Afternoon Screen Time: 45 minutes
            Activity Notes: Watched educational videos during breaks.
            
            ...
        """.trimIndent()

        // Back button functionality
        btnBack.setOnClickListener {
            finish()
        }
    }
}