package com.example.conversationalpunjabi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.conversationalpunjabi.databinding.FragmentPhrasesBinding

class FragmentPhrases : Fragment() {
    private lateinit var binding: FragmentPhrasesBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPhrasesBinding.inflate(layoutInflater, container, false)

        recyclerView = binding.recyclerviewPhrases
        recyclerView.layoutManager = LinearLayoutManager(context)

        val phrases = listOf(
            Phrase("Sata srī akāla", "Hello"),
            Phrase("ki gal hai?", "How are you?"),
            Phrase("Main theek haan", "I am fine"),
            Phrase("Tu-adey nal mil kar bahut khusi hoi", "Pleased to meet you"),
            Phrase("Shukriā", "Thank You"),
            Phrase("Tuhada naan ki hai?", "What is your name?"),
            Phrase("Mera naan haga...", "My name is..."),
            Phrase("Tusi kithe dey ho?", "Where are you from?"),
            Phrase("Ki hoya", "What Happened"),
            Phrase("Śubha savēra", "Good morning"),
            Phrase("Sata srī akāla", "Good evening"),
            Phrase("śubha rāta", "Good night"),
        )

        recyclerView.adapter = PhraseAdapter(phrases)

        return binding.root
    }

}