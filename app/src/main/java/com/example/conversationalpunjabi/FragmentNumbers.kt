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

        recyclerView = binding.recyclerviewNumbers
        recyclerView.layoutManager = LinearLayoutManager(context)

        val numbers = listOf(
            Number("sifar", "zero (0)"),
            Number("ikk", "one (1)"),
            Number("do", "two (2)"),
            Number("tinn", "three (3)"),
            Number("chā", "four (4)"),
            Number("punj","five (5)"),
            Number("che","six (6)"),
            Number("satt","seven (7)"),
            Number("aṭh","eight (8)"),
            Number("nauṃ","nine (9)"),
            Number("dass","ten (10)"),
            Number("giārāṃ","eleven (11)"),
            Number("bārāṃ","twelve (12)"),
            Number("tērāṃ","thirteen (13)"),
            Number("chaudāṃ","fourteen (14)"),
            Number("pandarāṃ","fifteen (15)")
        )

        recyclerView.adapter = NumberAdapter(numbers)

        return binding.root
    }

}