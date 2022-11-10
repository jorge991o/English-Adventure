package com.stasoft.inglishadventure

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity

import com.stasoft.inglishadventure.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {


    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_name)

        binding.buttonSiguiente.setOnClickListener(){
            val intent = Intent(this, NameActivity ::class.java)
            startActivity(intent)
        }

    }
}






