package com.example.ontime

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.ontime.Fragments.LoginAppFragment
import com.example.ontime.Fragments.SchedulePageFragment
import com.example.ontime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    var loginAppFragment = LoginAppFragment()
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setTheme(R.style.Theme_OnTime)
        setCurrentFragment(SchedulePageFragment())
    }

    private fun setCurrentFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFrame, fragment)
            commit()
        }
    }
}