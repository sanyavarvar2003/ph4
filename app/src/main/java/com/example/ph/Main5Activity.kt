package com.example.ph

import android.content.Intent
import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main5.*

class Main5Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        setSupportActionBar(toolbar)
    }
        fun n (v: View){
            val intent2 = Intent(this, Main6Activity::class.java)
            startActivity(intent2)
        }


}
