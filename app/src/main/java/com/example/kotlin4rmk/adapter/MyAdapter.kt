package com.example.kotlin4rmk.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin4rmk.databinding.ChangeItemBinding


class MyAdapter(private var list: List<String>) : RecyclerView.Adapter<MyAdapter.MyViewHolder>() {

    private lateinit var binding: ChangeItemBinding

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        binding = ChangeItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MyViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.onBind(list[position])
    }

    override fun getItemCount(): Int = list.size

    inner class MyViewHolder(itemView: ChangeItemBinding) :
        RecyclerView.ViewHolder(itemView.root) {

        fun onBind(position: String) {
            binding.tvCount.text = position
        }
    }
}