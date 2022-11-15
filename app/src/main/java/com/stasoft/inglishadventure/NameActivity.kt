package com.stasoft.inglishadventure

import android.content.Intent
import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat


import com.stasoft.inglishadventure.databinding.ActivityNameBinding

class NameActivity : AppCompatActivity() {

    private lateinit var binding: ActivityNameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityNameBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Buttoninicial.setOnClickListener() {
            val intent = Intent(this, MenuActivity::class.java)
            startActivity(intent)


        }
    }
}





