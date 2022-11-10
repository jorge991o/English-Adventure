package com.stasoft.inglishadventure


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stasoft.inglishadventure.databinding.ActivityInicioBinding




class InicioActivity : AppCompatActivity() {

    private lateinit var binding: ActivityInicioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("onCreate")
        binding = ActivityInicioBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_login)


    }

    override fun onStart() {
        super.onStart()
        println("onStart")

    }

    override fun onResume() {
        super.onResume()
        println("onResume")
    }

    override fun onPause() {
        super.onPause()
        println(" onPause")
    }

    override fun onStop() {
        super.onStop()
        println("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("onDestroy")
    }
}

