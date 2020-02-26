package com.example.ph

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Main12Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main12)
    }
    fun nee (v: View){
        val intent5 = Intent(this, MaintablitsaActivity::class.java)
        startActivity(intent5)
    }
    fun nee1 (v: View){
        val intent5 = Intent(this, tablica2::class.java)
        startActivity(intent5)
    }
}
