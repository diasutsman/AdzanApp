package com.dias.adzanapp.ui.prayertimes

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.dias.adzanapp.data.PrayerTimesRepository
import com.dias.adzanapp.databinding.FragmentPrayerTimeBinding

class PrayerTimeFragment : Fragment() {

    private var _binding: FragmentPrayerTimeBinding? = null
    private val binding get() = _binding as FragmentPrayerTimeBinding

    private val viewModel: PrayerTimesViewModel by viewModels {
        PrayerTimesViewModel.Factory(PrayerTimesRepository())
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentPrayerTimeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}