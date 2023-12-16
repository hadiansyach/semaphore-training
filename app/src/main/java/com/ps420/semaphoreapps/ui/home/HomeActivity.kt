package com.ps420.semaphoreapps.ui.home

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ps420.semaphoreapps.databinding.ActivityHomeBinding
import com.ps420.semaphoreapps.ui.challenge.ChallengeActivity
import com.ps420.semaphoreapps.ui.quiz.QuizActivity
import com.ps420.semaphoreapps.ui.quiz.StartActivity
import com.ps420.semaphoreapps.ui.setting.SettingActivity
import com.ps420.semaphoreapps.ui.translate.TranslateActivity

class HomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLearn.setOnClickListener {
            val intent = Intent(this, StartActivity::class.java)
            startActivity(intent)
        }
        binding.btnChallenge.setOnClickListener {
            val intent = Intent(this, ChallengeActivity::class.java)
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