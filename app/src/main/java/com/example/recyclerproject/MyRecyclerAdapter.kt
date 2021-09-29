package com.example.recyclerproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerproject.databinding.ListItemBinding


class MyRecyclerAdapter(private val fruitsList : List<Fruit>) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        return MyViewHolder(ListItemBinding.inflate(layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(fruitsList[position])
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }
}

class MyViewHolder(var binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(fruit : Fruit){
        binding.recyclerItemTextView.text = fruit.name
    }
}