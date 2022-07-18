package com.example.ontime

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ontime.databinding.FragmentSchedulePageBinding

class SchedulePageFragment : Fragment() {
    lateinit var binding: FragmentSchedulePageBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentSchedulePageBinding.inflate(inflater, container, false)
        return binding.root
    }
}