package com.example.mad_lab_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnGmail = findViewById<Button>(R.id.btnGmail)

        btnLogin.setOnClickListener {
            startActivity(Intent(this, LanguageSelectionActivity::class.java))
        }

        btnGmail.setOnClickListener {
            startActivity(Intent(this, LanguageSelectionActivity::class.java))
        }
    }
}
