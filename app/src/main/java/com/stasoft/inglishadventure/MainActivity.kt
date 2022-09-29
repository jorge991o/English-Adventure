package com.stasoft.inglishadventure

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stasoft.inglishadventure.databinding.ActivityMain2Binding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: MainActivity2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = MainActivity2()
        setContentView(R.layout.activity_main2)

        binding.buttonIniciarPantalla.setOnclickListener() {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
    }
}
