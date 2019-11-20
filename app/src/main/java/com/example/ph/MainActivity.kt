package com.example.ph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent




class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun newq (v: View){
        val intent = Intent(this, Main4Activity::class.java)
        startActivity(intent)
    }
    fun newq1 (v: View){
        val intent1 = Intent(this, Main5Activity::class.java)
        startActivity(intent1)
    }
}

