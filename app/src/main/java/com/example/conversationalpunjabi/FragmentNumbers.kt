package com.example.conversationalpunjabi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.conversationalpunjabi.databinding.FragmentNumbersBinding

class FragmentNumbers : Fragment() {
    private lateinit var binding: FragmentNumbersBinding
    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentNumbersBinding.inflate(layoutInflater, container, false)

        recyclerView = binding.numbersRecyclerview
        recyclerView.layoutManager = LinearLayoutManager(context)

        val numbers = listOf(
            Numbers("sifar", "Zero"),
            Numbers("ikk", "one")
        )

        recyclerView.adapter = NumberAdapter

        return binding.root
    }

}