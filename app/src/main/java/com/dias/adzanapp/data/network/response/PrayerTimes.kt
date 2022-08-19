package com.dias.adzanapp.data.network.response

import com.google.gson.annotations.SerializedName

data class PrayerTimes(

	@field:SerializedName("date")
	val date: String? = null,

	@field:SerializedName("asr")
	val asr: String? = null,

	@field:SerializedName("sunrise")
	val sunrise: String? = null,

	@field:SerializedName("isha")
	val isha: String? = null,

	@field:SerializedName("fajr")
	val fajr: String? = null,

	@field:SerializedName("zuhr")
	val zuhr: String? = null,

	@field:SerializedName("maghrib")
	val maghrib: String? = null
)