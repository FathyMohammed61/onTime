package com.example.ontime.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ontime.R
import com.example.ontime.databinding.FragmentSplashBinding


class SplashFragment : Fragment() {

    private lateinit var binding: FragmentSplashBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSplashBinding.inflate(inflater)
        delay()
        return binding.root
    }


    private fun delay() {
        Thread {
            try {
                Thread.sleep(2000)
            } catch (e: Exception) {
                println(e.toString())
            }
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.flMain, SchedulePageFragment())
                remove(this@SplashFragment)
                    .commit()
            }
        }.run()
    }

}