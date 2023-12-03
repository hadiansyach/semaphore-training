package com.ps420.semaphoreapps.ui.component

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.ps420.semaphoreapps.databinding.FragmentModalBottomSheetBinding

class ModalBottomSheetFragment : BottomSheetDialogFragment() {
    private lateinit var binding: FragmentModalBottomSheetBinding

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
            Toast.makeText(context, "Gallery", Toast.LENGTH_SHORT).show()
        }
    }


    companion object {
        const val TAG = "ModalBottomSheetFragment"
    }
}