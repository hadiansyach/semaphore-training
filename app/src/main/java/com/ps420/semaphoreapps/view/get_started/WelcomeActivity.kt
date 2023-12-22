package com.ps420.semaphoreapps.view.get_started

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import androidx.lifecycle.ViewModelProvider
import com.ps420.semaphoreapps.databinding.ActivityWelcomeBinding
import com.ps420.semaphoreapps.view.home.HomeActivity
import com.ps420.semaphoreapps.view.setting.SettingPreferences
import com.ps420.semaphoreapps.view.setting.SettingViewModel
import com.ps420.semaphoreapps.view.setting.SettingViewModelFactory
import com.ps420.semaphoreapps.view.setting.dataStore

class WelcomeActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWelcomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGetStarted.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }
    }

}