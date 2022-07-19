package com.example.ontime.Adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.ontime.DataClasses.ItemWithCardData
import com.example.ontime.R

class ItemWithCardAdaptor(private val itemWithCardViewItemList: ArrayList<ItemWithCardData>) :
    RecyclerView.Adapter<ItemWithCardAdaptor.MyItemWithCardViewHolder>() {
    inner class MyItemWithCardViewHolder(item: View) : RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyItemWithCardViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_with_card, parent, false)
        return MyItemWithCardViewHolder(view)
    }


    override fun onBindViewHolder(holder: MyItemWithCardViewHolder, position: Int) {
        val positionItem = itemWithCardViewItemList[position]
        val titleHeader: TextView = holder.itemView.findViewById(R.id.todoHeader)
        val selectedTime: TextView = holder.itemView.findViewById(R.id.selectedTime)
        val selectedPlace: TextView = holder.itemView.findViewById(R.id.selectedPlace)
        val selectedNotes: TextView = holder.itemView.findViewById(R.id.selectedNotes)

        holder.itemId.apply {
            titleHeader.text = positionItem.titleHeader
            selectedTime.text = positionItem.selectedTime
            selectedPlace.text = positionItem.selectedPlace
            selectedNotes.text = positionItem.selectedNotes

        }
    }

    override fun getItemCount(): Int {
        return itemWithCardViewItemList.size
    }
}