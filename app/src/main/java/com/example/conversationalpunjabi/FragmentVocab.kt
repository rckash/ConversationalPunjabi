package com.example.conversationalpunjabi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.conversationalpunjabi.databinding.FragmentVocabBinding

class FragmentVocab : Fragment() {
    private lateinit var binding: FragmentVocabBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentVocabBinding.inflate(layoutInflater, container, false)



        return binding.root
    }

}