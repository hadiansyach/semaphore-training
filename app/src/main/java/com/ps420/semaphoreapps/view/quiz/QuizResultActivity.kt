package com.ps420.semaphoreapps.view.quiz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ps420.semaphoreapps.R
import com.ps420.semaphoreapps.databinding.ActivityQuizResultBinding
import com.ps420.semaphoreapps.model.Constants.CORRECT_ANSWER
import com.ps420.semaphoreapps.model.Constants.TOTAL_QUESTIONS
import com.ps420.semaphoreapps.model.Constants.USER_NAME
import com.ps420.semaphoreapps.view.home.HomeActivity
import com.tomlecollegue.progressbars.CircleProgressView

class QuizResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val totalQuestion = intent.getIntExtra(TOTAL_QUESTIONS, 0)
        val correctAnswer = intent.getIntExtra(CORRECT_ANSWER, 0)
        val username = intent.getStringExtra(USER_NAME)

        val circleProgressView = findViewById<CircleProgressView>(R.id.circleProgressResult)
        circleProgressView.progress = (correctAnswer*totalQuestion)

        if (circleProgressView.progress == 100) {
            binding.txtHeaderResult.text = "Congratulations, you guessed it all!"
        } else if (circleProgressView.progress < 100) {
            binding.txtHeaderResult.text = "Here is your score"
        }

        binding.apply {
            name.text = username
            totalNumber.text = totalQuestion.toString()
            correctNumber.text = correctAnswer.toString()
            wrongNumber.text = (totalQuestion - correctAnswer).toString()
        }
        binding.btnFinish.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }
    }
}