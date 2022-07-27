package com.example.ontime

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.ontime.Fragments.AddTaskFragment
import com.example.ontime.Fragments.LoginAppFragment
import com.example.ontime.databinding.ActivityScheduleBinding

class ScheduleActivity : AppCompatActivity() {
    lateinit var binding: ActivityScheduleBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        val loginAppFragment = LoginAppFragment()
        binding = ActivityScheduleBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setCurrentFragment(loginAppFragment)
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFrame, fragment)
            commit()
        }
    }

}