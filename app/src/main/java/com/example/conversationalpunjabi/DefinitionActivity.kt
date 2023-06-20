package com.example.conversationalpunjabi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.conversationalpunjabi.databinding.ActivityDefinitionBinding

class DefinitionActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDefinitionBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDefinitionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.txtWordDefinitionActivity.text = intent.getStringExtra("mainWord")
        binding.txtDefinitionDefinitionActivity.text = intent.getStringExtra("mainDefinition")
    }
}