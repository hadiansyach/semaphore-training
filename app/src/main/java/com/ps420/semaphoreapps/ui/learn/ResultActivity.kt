package com.ps420.semaphoreapps.ui.learn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ps420.semaphoreapps.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val correctValue = intent.getStringExtra(CORRECT_VALUE)
        val totalValue = intent.getStringExtra(TOTAL)

        binding.correctAnswer.text = correctValue
        binding.totalAnswer.text = totalValue

    }


    companion object {
        const val CORRECT_VALUE = "correct_value"
        const val TOTAL = "total"
    }
}