package com.dias.adzanapp.ui.prayertimes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.dias.adzanapp.databinding.RowItemPrayertimeBinding

class PrayerTimesAdapter(private val listPrayerTimes: List<Model>) :
    RecyclerView.Adapter<PrayerTimesAdapter.PrayerTimesViewHolder>() {
    class PrayerTimesViewHolder(val binding: RowItemPrayertimeBinding) :
        RecyclerView.ViewHolder(binding.root)

    class Model(val prayerName: String, val prayerTime: String)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        PrayerTimesViewHolder(RowItemPrayertimeBinding.inflate(LayoutInflater.from(parent.context),
            parent,
            false))

    override fun onBindViewHolder(holder: PrayerTimesViewHolder, position: Int) {
        holder.binding.mPrayerTime = listPrayerTimes[position]
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}