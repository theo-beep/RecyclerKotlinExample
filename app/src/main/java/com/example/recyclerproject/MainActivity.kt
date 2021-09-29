package com.example.recyclerproject

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerproject.databinding.ActivityMainBinding


private lateinit var binding: ActivityMainBinding

val fruitsList = listOf<Fruit>(
    Fruit("Mango", "Tom"),
    Fruit("Apple", "Jake"),
    Fruit("Bannana", "Tom"),
    Fruit("Guava", "Sam"),
    Fruit("Lemon", "Tom"),
    Fruit("Pear", "Jake"),
    Fruit("Orange", "Tom")
)

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.myRecyclerView.setBackgroundColor(getColor(R.color.smokeyWhite))
        binding.myRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.myRecyclerView.adapter = MyRecyclerAdapter(fruitsList)
    }

    private fun listItemClicked(fruit: Fruit) {
        Toast.makeText(
            applicationContext, "Supplier Name ${fruit.supplier}",
            Toast.LENGTH_LONG
        ).show()
    }
}