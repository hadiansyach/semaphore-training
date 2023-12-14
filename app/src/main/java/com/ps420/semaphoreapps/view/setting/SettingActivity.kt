package com.ps420.semaphoreapps.view.setting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ps420.semaphoreapps.databinding.ActivitySettingBinding

class SettingActivity : AppCompatActivity() {
    private lateinit var binding : ActivitySettingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySettingBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

}