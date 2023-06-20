package com.example.conversationalpunjabi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.conversationalpunjabi.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityLoginBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val username = "user"
        val password = "admin"

        binding.btnLogin.setOnClickListener {
            var inputUsername = binding.editTextUsername.text.toString()
            var inputPassword = binding.editTextPassword.text.toString()
            Log.d("LoginActivity", "inputUsername: $inputUsername")
            Log.d("LoginActivity", "inputPassword: $inputPassword")

            if ((inputUsername == username) && (inputPassword == password)) {
                //go to Main Activity
                val myIntent = Intent(this, MainActivity::class.java)
                startActivity(myIntent)
                finish()
            } else {
                Toast.makeText(this, "Incorrect Credential/s", Toast.LENGTH_SHORT).show()
            }
        }

    }
}