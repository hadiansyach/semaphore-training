package com.ps420.semaphoreapps.view.learn

import android.os.Build
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.ortiz.touchview.TouchImageView
import com.ps420.semaphoreapps.R
import com.ps420.semaphoreapps.model.Constants.SEMAPHORE_DATA
import com.ps420.semaphoreapps.model.LearnData

class LearnDetailActivity : AppCompatActivity() {

    private lateinit var semaphoreImageView : TouchImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn_detail)

        setupView()

        val semaphore = if (Build.VERSION.SDK_INT >= 33 ) {
            intent.getParcelableExtra(SEMAPHORE_DATA, LearnData::class.java)
        } else {
            @Suppress("DEPRECATED")
            intent.getParcelableExtra(SEMAPHORE_DATA)
        }

        if (semaphore != null) {
            semaphoreImageView = findViewById(R.id.ivSemaphoreDetail)
            semaphoreImageView.setImageResource(semaphore.semaphoreImage)
        }


    }

    private fun setupView() {
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
    }
}