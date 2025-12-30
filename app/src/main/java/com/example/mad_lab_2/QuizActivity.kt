package com.example.mad_lab_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.RadioGroup
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class QuizActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz)

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroupQuiz)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)
        val btnBackLesson = findViewById<Button>(R.id.btnBackLesson)

        btnSubmit.setOnClickListener {
            val selectedId = radioGroup.checkedRadioButtonId
            if (selectedId == R.id.option1) {
                Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show()
            }

            findViewById<Button>(R.id.btnBackLesson).setOnClickListener {
                startActivity(Intent(this, DashboardActivity::class.java))
            }
        }

    }
}
