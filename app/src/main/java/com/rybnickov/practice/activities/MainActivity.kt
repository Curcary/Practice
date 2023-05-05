package com.rybnickov.practice.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rybnickov.practice.R
import com.rybnickov.practice.api.Database
import com.rybnickov.practice.api.IApiClient

class MainActivity : AppCompatActivity() {
    private val client by lazy {
        IApiClient.create(this@MainActivity)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val db = Database(this@MainActivity, null)
    }
}