package com.example.recyclerviewapp

import android.R
import android.os.Bundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerviewapp.adapter.ItemAdapter
import com.example.recyclerviewapp.data.remote.Item
import com.example.recyclerviewapp.databinding.ActivityMainBinding
import com.example.recyclerviewapp.util.Constants


class MainActivity : AppCompatActivity() {

    private val binding by lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }

    lateinit var itemAdapter: ItemAdapter
    lateinit var items: ArrayList<Item>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        items = Constants.listData()
        itemAdapter = ItemAdapter(this@MainActivity,items)
        binding.recycler.adapter = itemAdapter
        binding.recycler.layoutManager = LinearLayoutManager(this)
    }
}