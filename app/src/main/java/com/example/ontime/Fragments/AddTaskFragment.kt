package com.example.ontime.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.ontime.R
import com.example.ontime.databinding.FragmentAddTaskBinding


class AddTaskFragment : Fragment() {

    private lateinit var binding: FragmentAddTaskBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAddTaskBinding.inflate(inflater)
      passingData()
        return binding.root

    }

    private fun passingData() {
        val text = binding.addText.text.toString()
        val date = binding.addDate.text.toString()
        val notes = binding.addNotes.text.toString()
        val time = binding.addTime.text.toString()
        val place = binding.addPlace.text.toString()
        val checkedRemember = binding.cbRemember
        val btnCreateTask = binding.createTask

        btnCreateTask.setOnClickListener {

                Intent().putExtra("addText", text)
                Intent().putExtra("addDate", date)
                Intent().putExtra("addNotes", notes)
                Intent().putExtra("addTime", time)
                Intent().putExtra("addPlace", place)
                Intent().putExtra("cbRemember", false)

            parentFragmentManager.beginTransaction().also {
                it.replace(R.id.flMain, AddTaskFragment())
                it.commit()
            }
        }
    }
}