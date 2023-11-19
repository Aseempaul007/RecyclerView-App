package com.example.recyclerviewapp.adapter

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewapp.R
import com.example.recyclerviewapp.data.remote.Item
import com.example.recyclerviewapp.databinding.ListItemBinding

class ItemAdapter(
    private val context: Context,
    private val items: ArrayList<Item>
): RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

    inner class ItemViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val binding = ListItemBinding.inflate(LayoutInflater.from(context))
        return ItemViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.binding.imageView.setImageResource(items.get(position).image)
        holder.binding.textView.text = items.get(position).textOne
        holder.binding.textView2.text = items.get(position).textTwo
        holder.binding.textView2.isSelected = true
        holder.binding.textView3.text = items.get(position).textThree

        holder.itemView.setOnClickListener {
            val dialog = Dialog(context)
            dialog.setContentView(R.layout.list_dialog)
            dialog.findViewById<ImageView>(R.id.imageView2).setImageResource(items.get(position).image)
            dialog.show()
        }
    }
}