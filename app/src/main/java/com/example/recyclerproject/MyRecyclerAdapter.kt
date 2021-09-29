package com.example.recyclerproject

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerproject.databinding.ListItemBinding


class MyRecyclerAdapter(
    private val fruitsList: List<Fruit>,
    private val itemClickListener: (Fruit) -> Unit
) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        return MyViewHolder(ListItemBinding.inflate(layoutInflater, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(fruitsList[position], itemClickListener)
    }

    override fun getItemCount(): Int {
        return fruitsList.size
    }
}

class MyViewHolder(var binding: ListItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(fruit: Fruit, itemClickListener: (Fruit) -> Unit) {
        binding.recyclerItemTextView.text = fruit.name
        binding.recyclerItemTextView.setOnClickListener {
            itemClickListener(fruit)
        }
    }
}

