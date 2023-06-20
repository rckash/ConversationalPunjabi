package com.example.conversationalpunjabi

import androidx.recyclerview.widget.RecyclerView
import com.example.conversationalpunjabi.databinding.RecyclerviewItemLayoutBinding

class PhraseViewHolder(private val binding: RecyclerviewItemLayoutBinding): RecyclerView.ViewHolder(binding.root) {
    fun bind(phrase: Phrase) {
        binding.txtWord.text = phrase.phrase
    }
}