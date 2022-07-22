package com.example.profnotes

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Splash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(3000)
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
        finish()
    }
}