package com.ps420.semaphoreapps.ui.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ps420.semaphoreapps.databinding.ActivityStartBinding
import com.ps420.semaphoreapps.model.FakeLearnDataSourceExperimental.USER_NAME

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnStart.setOnClickListener {
            val etUsername = binding.etName.toString()
            if (etUsername.isNotEmpty()) {
                val quizActivity = Intent(this, QuizActivity::class.java)
                quizActivity.putExtra(USER_NAME, etUsername)
                startActivity(quizActivity)
                finish()
            } else {
                Toast.makeText(this, "Input Username!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}