package com.ps420.semaphoreapps.view.translate

import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.ps420.semaphoreapps.databinding.ActivityTranslateBinding
import com.ps420.semaphoreapps.utils.Result
import com.ps420.semaphoreapps.utils.reduceFileImage
import com.ps420.semaphoreapps.utils.uriToFile
import com.ps420.semaphoreapps.view.ViewModelFactory
import com.ps420.semaphoreapps.view.component.ModalBottomSheetFragment

class TranslateActivity : AppCompatActivity() {
    private lateinit var binding: ActivityTranslateBinding
    private val viewModel by viewModels<TranslateViewModel> {
        ViewModelFactory.getInstance(this)
    }
    private var currentImageUri: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTranslateBinding.inflate(layoutInflater)
        setContentView(binding.root)

        modalBottomSheet()

        setupAction()
    }

    private fun setupAction() {
        binding.btnUploadImage.setOnClickListener {
            uploadImage()
        }
        binding.fabClearText.setOnClickListener {
            binding.txtInputTranslate.setText("")
        }
    }

    private fun uploadImage() {
        currentImageUri?.let { uri ->
            // TODO: fix upload image yang berasal dari camera/gallery
            val imageFile = uriToFile(uri, this).reduceFileImage()
            Log.d("Image File", "showImage: ${imageFile.path}")
            showLoading(true)

            viewModel.uploadImage(imageFile).observe(this) { result ->
                when (result) {
                    is Result.Loading -> {
                        showLoading(true)
                    }

                    is Result.Success -> {
                        showLoading(false)
                        // testing response api
                        val predictedText = result.data.message.predictedClass
                        val confidenceText = result.data.message.confidence
                        showToast("Detected semaphore: ${result.data.message.predictedClass}")
                        appendTextToTextInputLayout(predictedText)
                    }

                    is Result.Error -> {
                        showToast(result.error)
                        Log.d(TAG, result.error)
                        showLoading(false)
                    }
                }
            }
        } ?: showToast("No image selected provided")
    }

    private fun appendTextToTextInputLayout(newText: String) {
        val currentText = binding.txtInputTranslate.text.toString()
        val updatedText = if (currentText.isEmpty()) newText else "$currentText$newText"
        binding.txtInputTranslate.setText(updatedText)
    }


    private fun showToast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun showLoading(isLoading: Boolean) {
        binding.progressBarUploadImage.visibility = if (isLoading) View.VISIBLE else View.GONE
    }

    fun getImageUri(uri: Uri?) {
        currentImageUri = uri
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