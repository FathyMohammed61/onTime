package com.example.ontime.Fragments

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ontime.Adaptors.ItemWithCardAdaptor
import com.example.ontime.DataClasses.ItemWithCardData
import com.example.ontime.R
import com.example.ontime.databinding.FragmentSchedulePageBinding


class SchedulePageFragment : Fragment() {

    private lateinit var binding: FragmentSchedulePageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = FragmentSchedulePageBinding.inflate(inflater, container, false)
        myCardItem()
        navToAddTaskFragment()
        return binding.root
    }

    private fun myCardItem() {
        val item = arrayListOf<ItemWithCardData>(
            ItemWithCardData("me", " 4:55pm", "250", "cairo", true),
            ItemWithCardData("me", " 4:55pm", "250", "cairo", false),
            ItemWithCardData("ewewewewe", " 4:55pm", "250", "sdsdfdfdfds", true),
            ItemWithCardData("me", " 4:55pm", "250", "cairo", true),
            ItemWithCardData("me", " 4:55pm", "250", "cairo", true),
            ItemWithCardData("me", " 4:55pm", "250", "cairo", false),
            ItemWithCardData("ewewewewe", " 4:55pm", "250", "sdsdfdfdfds", true),
            ItemWithCardData("me", " 4:55pm", "250", "cairo", true),
            ItemWithCardData("me", " 4:55pm", "250", "cairo", true),
            ItemWithCardData("me", " 4:55pm", "250", "cairo", false),
            ItemWithCardData("ewewewewe", " 4:55pm", "250", "sdsdfdfdfds", true),
            ItemWithCardData("me", " 4:55pm", "250", "cairo", true),
        )
        val clToast: ConstraintLayout? = view?.findViewById(R.id.clToast)
        if (item.isEmpty()) {
            Toast(context).apply {
                duration = Toast.LENGTH_LONG
                layoutInflater.inflate(R.layout.if_item_null, clToast).also {
                    view = it
                }
                setGravity(Gravity.CENTER, 0, 0)
                show()
            }
        }
        val adaptor = ItemWithCardAdaptor(item)
        binding.rvItem.adapter = adaptor
        binding.rvItem.layoutManager =
            LinearLayoutManager(activity)
        adaptor.notifyItemInserted(item.size - 1)
    }

    private fun navToAddTaskFragment() {
        binding.fabNavToAddTask.setOnClickListener {
            parentFragmentManager.beginTransaction().apply {
                replace(R.id.flMain, AddTaskFragment())
                    .addToBackStack("null")
                    .commit()
            }
        }

    }
}