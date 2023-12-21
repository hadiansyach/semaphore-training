package com.ps420.semaphoreapps.data.response

import com.google.gson.annotations.SerializedName

data class UploadImageResponse(

	@field:SerializedName("success")
	val success: Boolean,

	@field:SerializedName("message")
	val message: Message
)

// success predicted `message` json body
data class Message(

	@field:SerializedName("confidence")
	val confidence: Int,

	@field:SerializedName("predicted_class")
	val predictedClass: String
)
