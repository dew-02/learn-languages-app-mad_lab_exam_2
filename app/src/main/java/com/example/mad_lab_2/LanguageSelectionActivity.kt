package com.example.mad_lab_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LanguageSelectionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language_selection)

        val btnEnglish = findViewById<Button>(R.id.btnEnglish)
        val btnSpanish = findViewById<Button>(R.id.btnSpanish)
        val btnFrench = findViewById<Button>(R.id.btnFrench)
        val btnGerman = findViewById<Button>(R.id.btnGerman)

        val intentDashboard = Intent(this, DashboardActivity::class.java)

        btnEnglish.setOnClickListener { startActivity(intentDashboard) }
        btnSpanish.setOnClickListener { startActivity(intentDashboard) }
        btnFrench.setOnClickListener { startActivity(intentDashboard) }
        btnGerman.setOnClickListener { startActivity(intentDashboard) }
    }
}
