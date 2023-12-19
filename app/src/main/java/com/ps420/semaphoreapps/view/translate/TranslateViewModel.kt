package com.ps420.semaphoreapps.view.translate

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.ps420.semaphoreapps.data.Repository
import com.ps420.semaphoreapps.data.response.UploadImageResponse
import com.ps420.semaphoreapps.utils.Result
import java.io.File

class TranslateViewModel(private val repository: Repository): ViewModel() {
    fun uploadImage(file: File): LiveData<Result<UploadImageResponse>> {
        return repository.uploadImage(file)
    }
}