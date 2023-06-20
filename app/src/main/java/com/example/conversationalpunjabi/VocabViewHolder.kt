package com.example.conversationalpunjabi

import androidx.recyclerview.widget.RecyclerView
import com.example.conversationalpunjabi.databinding.RecyclerviewItemLayoutBinding

class VocabViewHolder(private val binding: RecyclerviewItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(vocab: Vocab) {
        binding.txtWord.text = vocab.word
    }
}