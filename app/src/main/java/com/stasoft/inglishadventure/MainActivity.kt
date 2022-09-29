package com.stasoft.inglishadventure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stasoft.inglishadventure.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

        private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        binding.buttonSiguiente.setOnClickListener(){
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }
    }
}
