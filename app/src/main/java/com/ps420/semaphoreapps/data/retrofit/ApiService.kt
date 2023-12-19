package com.ps420.semaphoreapps.data.retrofit

import com.ps420.semaphoreapps.data.response.UploadImageResponse
import okhttp3.MultipartBody
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.Part

interface ApiService {
    @Multipart
    @POST("classify_semaphore")
    suspend fun uploadImage(
        @Part image: MultipartBody.Part,
    ) : UploadImageResponse

}