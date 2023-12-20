package com.ps420.semaphoreapps.view.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.ps420.semaphoreapps.databinding.ActivityStartBinding
import com.ps420.semaphoreapps.model.Constants.USER_NAME

class StartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnStart.setOnClickListener {
            val username = binding.etName.text.toString()
            if (username.isNotEmpty()) {
                val quizActivity = Intent(this, QuizActivity::class.java)
                quizActivity.putExtra(USER_NAME, username)
                Log.i("startActivity", "username: $username")
                startActivity(quizActivity)
                finish()
            } else {
                Toast.makeText(this, "Input Username!", Toast.LENGTH_SHORT).show()
            }
        }

    }
}