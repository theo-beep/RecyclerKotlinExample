package com.example.recyclerproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerproject.databinding.ListItemBinding


class MyRecyclerAdapter : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        return MyViewHolder(ListItemBinding.inflate(layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.binding.recyclerItemTextView.text = " test"
    }

    override fun getItemCount(): Int {
        return 5
    }
}

class MyViewHolder(var binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

}