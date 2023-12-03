package com.ps420.semaphoreapps.ui.component

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.activity.result.PickVisualMediaRequest
import androidx.activity.result.contract.ActivityResultContracts
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.ps420.semaphoreapps.databinding.FragmentModalBottomSheetBinding
import com.ps420.semaphoreapps.ui.translate.TranslateActivity

class ModalBottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentModalBottomSheetBinding
    private var currentImageUri: Uri? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentModalBottomSheetBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCamera.setOnClickListener {
            Toast.makeText(context, "Camera", Toast.LENGTH_SHORT).show()
        }

        binding.btnGallery.setOnClickListener {
            startGallery()
            Toast.makeText(context, "Gallery", Toast.LENGTH_SHORT).show()
        }
    }

    fun startGallery() {
        launcherGallery.launch(PickVisualMediaRequest(ActivityResultContracts.PickVisualMedia.ImageOnly))
    }

    private val launcherGallery = registerForActivityResult(
        ActivityResultContracts.PickVisualMedia()
    ) { uri: Uri? ->
        if (uri != null) {
            currentImageUri = uri
            (activity as TranslateActivity).showImage(currentImageUri)
            dismiss()
        } else {
            Log.e("Photo Picker", "onActivityResult: uri is null")
        }
    }

    companion object {
        const val TAG = "ModalBottomSheetFragment"
    }
}