package com.example.recyclerproject


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerproject.databinding.ListItemBinding

private lateinit var binding :ListItemBinding

class myRecyclerAdapter  : RecyclerView.Adapter<MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.list_item,parent ,false)
        return MyViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        binding.recyclerItemTextView.text = "test"
    }

    override fun getItemCount(): Int {
        return 5
    }
}

class MyViewHolder(var view:View) : RecyclerView.ViewHolder(view){

}