package com.example.conversationalpunjabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils.replace
import com.example.conversationalpunjabi.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //create objects from Fragments
        val fVocab = FragmentVocab()
        val fPhrases = FragmentPhrases()
        val fNumbers = FragmentNumbers()

        //default fragment
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, fVocab)
            commit()
        }

        //fragments navigation
        binding.bottomNav.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.menu_vocab -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, fVocab)
                        commit()
                    }
                }
                R.id.menu_phrases -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, fPhrases)
                        commit()
                    }
                }
                R.id.menu_numbers -> {
                    supportFragmentManager.beginTransaction().apply {
                        replace(R.id.fragmentContainerView, fNumbers)
                        commit()
                    }
                }
            }
            true
        }
    }
}