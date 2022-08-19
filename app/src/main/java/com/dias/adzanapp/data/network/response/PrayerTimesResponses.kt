package com.dias.adzanapp.data.network.response

import com.google.gson.annotations.SerializedName

data class PrayerTimesResponses(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("times")
	val times: List<PrayerTimes?>? = null,

	@field:SerializedName("latitude")
	val latitude: Double? = null,

	@field:SerializedName("days")
	val days: Int? = null,

	@field:SerializedName("location")
	val location: String? = null,

	@field:SerializedName("longitude")
	val longitude: Double? = null
)