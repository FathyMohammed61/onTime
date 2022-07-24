package com.example.ontime.Fragments

import android.annotation.SuppressLint
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
        customCalender()
        return binding.root
    }

    @SuppressLint("ResourceType")
    private fun customCalender() {
        binding.cvDate.apply {
            rootView.setBackgroundColor(R.color.black)
        }
    }

    private fun myCardItem() {
        val item = arrayListOf<ItemWithCardData>(
            ItemWithCardData("me", " 4:55pm", "250", "cairo"),
            ItemWithCardData("me", " 4:55pm", "250", "cairo"),
            ItemWithCardData("ewewewewe", " 4:55pm", "250", "sdsdfdfdfds"),
            ItemWithCardData("me", " 4:55pm", "250", "cairo"),
        )
        val clToast: ConstraintLayout? = view?.findViewById(R.id.clToast)

        if (item.isEmpty()) {
            Toast(context).apply {
                duration = Toast.LENGTH_LONG
                view = layoutInflater.inflate(R.layout.if_item_null, clToast)
                 setGravity(Gravity.AXIS_SPECIFIED,0,0)
                show()
            }
        }
        val adaptor = ItemWithCardAdaptor(item)
        binding.rvItem.adapter = adaptor
        binding.rvItem.layoutManager =
            LinearLayoutManager(activity)
        adaptor.notifyItemInserted(item.size - 1)



    }
}