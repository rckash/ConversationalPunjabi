package com.example.conversationalpunjabi

import androidx.recyclerview.widget.RecyclerView
import com.example.conversationalpunjabi.databinding.RecyclerviewItemLayoutBinding

class NumberViewHolder(private val binding: RecyclerviewItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(number: Number) {
        binding.txtWord.text = number.number
    }

}