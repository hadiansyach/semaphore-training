package com.ps420.semaphoreapps.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.ps420.semaphoreapps.R
import com.ps420.semaphoreapps.databinding.ActivityHomeBinding
import com.ps420.semaphoreapps.databinding.ActivityLearnBinding
import com.ps420.semaphoreapps.ui.learn.LearnActivity

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
    }
}