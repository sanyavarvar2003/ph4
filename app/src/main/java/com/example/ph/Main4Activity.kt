package com.example.ph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.content.ContextCompat.startActivity

class Main4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
    }

    fun ne(v: View) {
        val intent3 = Intent(this, Main2Activity::class.java)
        startActivity(intent3)
    }
    fun nc(v: View) {
        val intent4 = Intent(this, MainkuliActivity::class.java)
        startActivity(intent4)
    }
}

