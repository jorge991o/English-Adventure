package com.stasoft.inglishadventure

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.stasoft.inglishadventure.ui.main.MainFragment

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }
    }
}