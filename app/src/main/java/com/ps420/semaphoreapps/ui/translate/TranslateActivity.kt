package com.ps420.semaphoreapps.ui.translate

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ps420.semaphoreapps.databinding.ActivityTranslateBinding
import com.ps420.semaphoreapps.ui.component.ModalBottomSheetFragment

class TranslateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTranslateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTranslateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        modalBottomSheet()
    }

    private fun modalBottomSheet() {
        binding.btnTakeImage.setOnClickListener {
            val bottomSheet = ModalBottomSheetFragment()
            bottomSheet.show(supportFragmentManager, ModalBottomSheetFragment.TAG)
        }
    }

    fun showImage(uri: Uri?) {
        uri?.let {
            binding.imgDataset.setImageURI(it)
            Log.d("IMAGE URI", "showImage: $it")
        }
    }

    companion object {
        private const val TAG = "TRANSLATE ACTIVITY"
    }
}