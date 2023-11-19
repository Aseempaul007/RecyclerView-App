package com.example.recyclerviewapp.util

import com.example.recyclerviewapp.R
import com.example.recyclerviewapp.data.remote.Item

object Constants {
    fun listData(): ArrayList<Item>{
        val items = arrayListOf<Item>()
        items.add(Item(R.drawable.one,"Image 1","This is the description of my image one which is placed here","Img1"))
        items.add(Item(R.drawable.one,"Image 1","This is the description of my image one which is placed here","Img1"))
        items.add(Item(R.drawable.one,"Image 1","This is the description of my image one which is placed here","Img1"))
        items.add(Item(R.drawable.one,"Image 1","This is the description of my image one which is placed here","Img1"))
        items.add(Item(R.drawable.one,"Image 1","This is the description of my image one which is placed here","Img1"))
        items.add(Item(R.drawable.one,"Image 1","This is the description of my image one which is placed here","Img1"))
        items.add(Item(R.drawable.one,"Image 1","This is the description of my image one which is placed here","Img1"))
        items.add(Item(R.drawable.one,"Image 1","This is the description of my image one which is placed here","Img1"))
        items.add(Item(R.drawable.one,"Image 1","This is the description of my image one which is placed here","Img1"))
        items.add(Item(R.drawable.one,"Image 1","This is the description of my image one which is placed here","Img1"))
        return items
    }
}