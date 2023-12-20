package com.ps420.semaphoreapps.view.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ps420.semaphoreapps.databinding.ActivityHomeBinding
import com.ps420.semaphoreapps.view.challenge.ChallengeActivity
import com.ps420.semaphoreapps.view.learn.LearnActivity
import com.ps420.semaphoreapps.view.quiz.QuizActivity
import com.ps420.semaphoreapps.view.quiz.StartQuizActivity
import com.ps420.semaphoreapps.view.setting.SettingActivity
import com.ps420.semaphoreapps.view.translate.TranslateActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLearn.setOnClickListener {
            val intent = Intent(this, LearnActivity::class.java)
            startActivity(intent)
        }
        binding.btnChallenge.setOnClickListener {
            val intent = Intent(this, StartQuizActivity::class.java)
            startActivity(intent)
        }

        binding.btnTranslate.setOnClickListener {
            val intent = Intent(this, TranslateActivity::class.java)
            startActivity(intent)
        }

        binding.btnSetting.setOnClickListener {
            val intent = Intent(this, SettingActivity::class.java)
            startActivity(intent)
        }

    }
}