package com.example.ontime.Fragments

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.ontime.Adaptors.ItemWithCardAdaptor
import com.example.ontime.DataClasses.ItemWithCardData
import com.example.ontime.MainActivity
import com.example.ontime.R
import com.example.ontime.databinding.FragmentSchedulePageBinding

private var item = arrayListOf(
    ItemWithCardData("me", " 4:55pm", "250", "cairo"),
    ItemWithCardData("me", " 4:55pm", "250", "cairo")
)

class SchedulePageFragment : Fragment() {

    lateinit var binding: FragmentSchedulePageBinding

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
        val adaptor = ItemWithCardAdaptor(item)
        binding.rcItem.layoutManager = LinearLayoutManager(activity as MainActivity)
        adaptor.notifyItemInserted(item.size - 1)
    }
}