package com.example.networking.Model

import com.google.gson.annotations.SerializedName

data class Data(

	@field:SerializedName("activity")
	val activity: String? = null,

	@field:SerializedName("accessibility")
	val accessibility: Double? = null,

	@field:SerializedName("price")
	val price: Int? = null,

	@field:SerializedName("link")
	val link: String? = null,

	@field:SerializedName("type")
	val type: String? = null,

	@field:SerializedName("key")
	val key: String? = null,

	@field:SerializedName("participants")
	val participants: Int? = null
)
