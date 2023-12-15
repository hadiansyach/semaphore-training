package com.ps420.semaphoreapps.data

import android.util.Log
import androidx.lifecycle.liveData
import com.google.gson.Gson
import com.ps420.semaphoreapps.data.response.UploadImageResponse
import com.ps420.semaphoreapps.data.retrofit.ApiService
import java.io.File
import com.ps420.semaphoreapps.utils.Result
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.MultipartBody
import okhttp3.RequestBody.Companion.asRequestBody
import retrofit2.HttpException

class Repository private constructor(
    private val apiService: ApiService
){

    fun uploadImage(imageFile: File) = liveData {
        emit(Result.Loading)
        val requestImageFile = imageFile.asRequestBody("image/jpeg".toMediaType())
        val multipartBody = MultipartBody.Part.createFormData(
            "image",
            imageFile.name,
            requestImageFile
        )
        try {
            val successResponse = apiService.uploadImage(multipartBody)
            Log.d(TAG, "uploadImage: $successResponse")
            emit(Result.Success(successResponse))
        } catch (e: HttpException) {
            val errorBody = e.response()?.errorBody()?.string()
            val errorResponse = Gson().fromJson(errorBody, UploadImageResponse::class.java)
            Log.d(TAG, "$errorResponse")
            emit(Result.Error(errorResponse.message.toString()))
        } catch (e: Exception) {
            Log.e(TAG, "response: ${e.message}")
            emit(Result.Error("An unexpected error occurred. ${e.message}"))
    }

}

    companion object {
        private const val TAG = "Repository"
        fun getInstance(apiService: ApiService): Repository = Repository(apiService)
    }
}