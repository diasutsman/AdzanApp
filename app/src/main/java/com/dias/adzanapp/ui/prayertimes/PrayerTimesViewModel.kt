package com.dias.adzanapp.ui.prayertimes

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.dias.adzanapp.data.PrayerTimesRepository
import com.dias.adzanapp.data.network.response.PrayerTimesResponses

class PrayerTimesViewModel(private val repository: PrayerTimesRepository) : ViewModel() {

    private var _prayersData = MutableLiveData<PrayerTimesResponses?>()
    val prayersData = _prayersData as LiveData<PrayerTimesResponses?>

    private var _isLoading = MutableLiveData(true)
    val isLoading = _isLoading as LiveData<Boolean>

    private var _isError = MutableLiveData<Throwable?>()
    val isError = _isError as LiveData<Throwable?>

    fun getPrayerTimes(location: String) {
        repository.getPrayerTimes(location, {
            _prayersData.value = it
            _isLoading.value = false
            _isError.value = null
        }, {
            _isLoading.value = false
            _isError.value = it
            _prayersData.value = null
        })
    }

    class Factory(private val prayertimesRepository: PrayerTimesRepository) :
        ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(PrayerTimesViewModel::class.java)) {
                @Suppress("UNCHECKED_CAST")
                return PrayerTimesViewModel(prayertimesRepository) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}