package com.dias.adzanapp.data.network

import com.dias.adzanapp.data.network.response.PrayerTimesResponses
import io.reactivex.rxjava3.core.Flowable
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

interface PrayerTimesService {

    @GET("prayer/Times")
    fun getPrayerTimesByLocation(
        @Query("location") location: String,
    ): Flowable<PrayerTimesResponses>

    @GET("prayer/Times")
    fun getPrayerTimesByLattLong(
        @Query("latitude") latitude: Double,
        @Query("longitude") longitude: Double,
    ): Flowable<PrayerTimesResponses>
}