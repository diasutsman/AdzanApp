package com.dias.adzanapp.ui.prayernotification

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.dias.adzanapp.R

class PrayerNotificationFragment : Fragment() {

    companion object {
        fun newInstance() = PrayerNotificationFragment()
    }

    private lateinit var viewModel: PrayerNotificationViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_prayer_notification, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(PrayerNotificationViewModel::class.java)
        // TODO: Use the ViewModel
    }

}