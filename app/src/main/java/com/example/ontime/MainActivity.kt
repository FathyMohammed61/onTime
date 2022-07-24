package com.example.ontime

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ontime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        delay()
    }

    private fun delay() {
        Thread(Runnable {
            Thread.sleep(1000)

            Intent(this, ScheduleActivity::class.java).also {
                startActivity(it)
            }
        }).run()
    }
}