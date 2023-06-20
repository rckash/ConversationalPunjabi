package com.example.conversationalpunjabi

import androidx.recyclerview.widget.RecyclerView
import com.example.conversationalpunjabi.databinding.NumberLayoutBinding

class NumberViewHolder(private val binding: NumberLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(number: Number) {
        binding.txtWord.text = number.number
    }
}