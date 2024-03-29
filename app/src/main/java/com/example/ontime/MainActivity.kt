package com.example.ontime

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ontime.Fragments.SplashFragment
import com.example.ontime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flMain, SplashFragment())
                .commit()
        }

    }
}