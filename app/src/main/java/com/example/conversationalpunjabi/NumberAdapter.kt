package com.example.conversationalpunjabi

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.conversationalpunjabi.databinding.RecyclerviewItemLayoutBinding

class NumberAdapter(private val numbers: List<Number>): RecyclerView.Adapter<NumberViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NumberViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerviewItemLayoutBinding.inflate(inflater, parent, false)
        return NumberViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return numbers.size
    }

    override fun onBindViewHolder(holder: NumberViewHolder, position: Int) {
        holder.bind(numbers[position])

        //for transferring data to definition activity
        holder.itemView.setOnClickListener {
            var myIntent = Intent(holder.itemView.context, DefinitionActivity::class.java)
            myIntent.putExtra("mainWord", numbers[position].number)
            myIntent.putExtra("mainDefinition", numbers[position].meaning)
            holder.itemView.context.startActivity(myIntent)
        }
    }

}