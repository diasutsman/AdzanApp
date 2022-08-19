package com.dias.adzanapp.data

import com.dias.adzanapp.data.network.PrayerTimesConfig
import com.dias.adzanapp.data.network.response.PrayerTimesResponses
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class PrayerTimesRepository {
    fun getPrayerTimes(
        location: String,
        onResponseHandler: (PrayerTimesResponses) -> Unit,
        onErrorHandler: (Throwable) -> Unit,
    ) {
        PrayerTimesConfig.getPrayerTimesService()
            .getPrayerTimesByLocation(location)
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                onResponseHandler(it)
            }, {
                onErrorHandler(it)
            })
    }
}