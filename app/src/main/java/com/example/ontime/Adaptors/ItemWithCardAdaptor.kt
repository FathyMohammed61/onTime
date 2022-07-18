package com.example.ontime.Adaptors

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.ontime.R

class ItemWithCardAdaptor(private val itemWithCardViewItemList: List<String>) :
    RecyclerView.Adapter<ItemWithCardAdaptor.MyItemWithCardViewHolder>() {
    inner class MyItemWithCardViewHolder(item: View) : RecyclerView.ViewHolder(item)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyItemWithCardViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_with_card, parent, false)
        return MyItemWithCardViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyItemWithCardViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 0
    }
}