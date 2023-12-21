package com.ps420.semaphoreapps.data.di

import android.content.Context
import com.ps420.semaphoreapps.data.Repository
import com.ps420.semaphoreapps.data.retrofit.ApiConfig

object Injection {
    fun provideRepository(context: Context): Repository {
        val apiService = ApiConfig.getApiService()
        return Repository.getInstance(apiService)
    }
}