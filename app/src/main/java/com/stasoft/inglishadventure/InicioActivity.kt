package com.stasoft.inglishadventure


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.stasoft.inglishadventure.databinding.ActivityInicioBinding
import java.lang.Thread.sleep


class InicioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInicioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
         binding = ActivityInicioBinding.inflate(layoutInflater)
         setContentView(binding.root)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "hola",Toast.LENGTH_LONG)
        sleep(3000)

        finish()
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

}

