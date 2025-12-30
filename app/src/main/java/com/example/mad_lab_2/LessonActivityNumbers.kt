package com.example.mad_lab_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LessonActivityNumbers : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lesson_activity_numbers)

        val btnListen = findViewById<Button>(R.id.btnListen)
        val btnNext = findViewById<Button>(R.id.btnNext)
        val btnbtnBackLesson = findViewById<Button>(R.id.btnBackLesson)


        btnListen.setOnClickListener {
            Toast.makeText(this, "Playing pronunciation...", Toast.LENGTH_SHORT).show()
        }

        btnNext.setOnClickListener {
            Toast.makeText(this, "Next lesson coming soon", Toast.LENGTH_SHORT).show()
        }
        findViewById<Button>(R.id.btnBackLesson).setOnClickListener {
            startActivity(Intent(this, DashboardActivity::class.java))
        }
    }
}
