package com.example.ontime

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ontime.databinding.FragmentLiginAppBinding


class LoginAppFragment : Fragment() {
    lateinit var binding: FragmentLiginAppBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentLiginAppBinding.inflate(inflater, container, false)
        goToSchedule1()
        return binding.root
    }


    private fun goToSchedule1() {
        binding.btnStart.setOnClickListener {
            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.flFrame, SchedulePageFragment())?.commit()
        }
    }


}