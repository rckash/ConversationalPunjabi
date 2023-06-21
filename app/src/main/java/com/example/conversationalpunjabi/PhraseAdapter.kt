package com.example.conversationalpunjabi

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.conversationalpunjabi.databinding.RecyclerviewItemLayoutBinding

class PhraseAdapter(private val phrases: List<Phrase>): RecyclerView.Adapter<PhraseViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PhraseViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RecyclerviewItemLayoutBinding.inflate(inflater, parent, false)
        return PhraseViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return phrases.size
    }

    override fun onBindViewHolder(holder: PhraseViewHolder, position: Int) {
        holder.bind(phrases[position])

        //for transferring data to definition activity
        holder.itemView.setOnClickListener {
            var myIntent = Intent(holder.itemView.context, DefinitionActivity::class.java)
            myIntent.putExtra("mainWord", phrases[position].phrase)
            myIntent.putExtra("mainDefinition", phrases[position].meaning)
            holder.itemView.context.startActivity(myIntent)
        }
    }

}