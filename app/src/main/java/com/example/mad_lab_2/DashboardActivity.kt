package com.example.mad_lab_2

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        findViewById<Button>(R.id.btnBasicWords).setOnClickListener {
            startActivity(Intent(this, LessonActivity::class.java))
        }

        findViewById<Button>(R.id.btnPhrases).setOnClickListener {
            startActivity(Intent(this, LessonActivityPhrases::class.java))
        }

        findViewById<Button>(R.id.btnNumbers).setOnClickListener {
            startActivity(Intent(this, LessonActivityNumbers::class.java))
        }

        findViewById<Button>(R.id.btnQuiz).setOnClickListener {
            startActivity(Intent(this, QuizActivity::class.java))
        }

        findViewById<Button>(R.id.btnProgress).setOnClickListener {
            startActivity(Intent(this, ProgressActivity::class.java))
        }
        findViewById<Button>(R.id.btnBackDashboard).setOnClickListener {
            startActivity(Intent(this, LanguageSelectionActivity::class.java))
        }

    }
}
