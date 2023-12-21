package com.ps420.semaphoreapps.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LearnData(
    val semaphoreName: String,
    val semaphoreImage: Int
) : Parcelable
