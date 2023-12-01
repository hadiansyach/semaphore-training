package com.ps420.semaphoreapps.ui.learn

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ps420.semaphoreapps.databinding.ActivityResultBinding
import com.ps420.semaphoreapps.ui.home.HomeActivity

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val correctValue = intent.getStringExtra(CORRECT_VALUE)
        val totalValue = intent.getStringExtra(TOTAL)

        val homeIntent = Intent(this, HomeActivity::class.java)
        homeIntent.flags = Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK
        binding.apply {
            correctAnswer.text = correctValue
            totalAnswer.text = totalValue
            btnBackHome.setOnClickListener {
                startActivity(homeIntent)
            }
        }
    }


    companion object {
        const val CORRECT_VALUE = "correct_value"
        const val TOTAL = "total"
    }
}