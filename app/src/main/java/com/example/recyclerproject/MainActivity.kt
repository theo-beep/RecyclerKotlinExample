package com.example.recyclerproject

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerproject.databinding.ActivityMainBinding


private lateinit var binding : ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.myRecyclerView.setBackgroundColor(getColor(R.color.smokeyWhite))
        binding.myRecyclerView.layoutManager = LinearLayoutManager(this)
        binding.myRecyclerView.adapter = myRecyclerAdapter()
    }
}