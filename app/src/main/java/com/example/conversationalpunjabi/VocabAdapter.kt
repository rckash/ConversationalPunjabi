package com.example.conversationalpunjabi

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.conversationalpunjabi.databinding.RecyclerviewItemLayoutBinding

class VocabAdapter(private val vocabs: List<Vocab>): RecyclerView.Adapter<VocabViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VocabViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerviewItemLayoutBinding.inflate(inflater, parent, false)
        return VocabViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return vocabs.size
    }

    override fun onBindViewHolder(holder: VocabViewHolder, position: Int) {
        holder.bind(vocabs[position])

        //for transferring data to definition activity
        holder.itemView.setOnClickListener {
            Toast.makeText(holder.itemView.context, vocabs[position].word, Toast.LENGTH_SHORT).show()
            var myIntent = Intent(holder.itemView.context, DefinitionActivity::class.java)
            myIntent.putExtra("mainWord", vocabs[position].word)
            myIntent.putExtra("mainDefinition", vocabs[position].meaning)
            holder.itemView.context.startActivity(myIntent)
        }
    }

}