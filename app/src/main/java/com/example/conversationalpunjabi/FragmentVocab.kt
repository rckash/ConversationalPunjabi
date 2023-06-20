package com.example.conversationalpunjabi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.conversationalpunjabi.databinding.FragmentVocabBinding

class FragmentVocab : Fragment() {
    private lateinit var binding: FragmentVocabBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVocabBinding.inflate(layoutInflater, container, false)

        recyclerView = binding.recyclerviewVocab
        recyclerView.layoutManager = LinearLayoutManager(context)

        val vocabs = listOf(
            Vocab("Kar", "Home"),
            Vocab("Ithy ah", "Come"),
            Vocab("Jaa", "Go"),
            Vocab("Bah", "Sit"),
            Vocab("Hus", "Laugh"),
            Vocab("Khush","Happy"),
            Vocab("Andar","Inside"),
            Vocab("Door","Far"),
            Vocab("Paas","Near"),
            Vocab("Panni","Water"),
            Vocab("Khana","Eat"),
            Vocab("Pinna","Drink"),
            Vocab("Mauf karna","Sorry"),
            Vocab("Savāgata hai","Welcome"),
            Vocab("Aaho","Yes"),
            Vocab("Nahi","No")
        )

        recyclerView.adapter = VocabAdapter(vocabs)

        return binding.root
    }

}