package com.example.conversationalpunjabi

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.conversationalpunjabi.databinding.NumberLayoutBinding

class NumberAdapter(private val numbers: List<Number>): RecyclerView.Adapter<NumberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = NumberLayoutBinding.inflate(inflater, parent, false)
        return NumberViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return numbers.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.bind(numbers[position])
    }

}