package com.example.ph

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_mainkuli.*

class MainkuliActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mainkuli)
    }
    fun on (v : View) {
        var v1: Float = 0f

        if (input7.text.toString() == "") {
            var a = input5.text.toString().toFloat()
            var b = input6.text.toString().toFloat()
            v1 = a / (b * 9.8f)
        }

        if (input6.text.toString() == "") {
            var a = input5.text.toString().toFloat()
            var c = input7.text.toString().toFloat()
            v1 = a / (c * 9.8f)
        }
        if (input5.text.toString() == "") {
            var b = input6.text.toString().toFloat()
            var c = input7.text.toString().toFloat()
            v1 = c * b * 9.8f
        }


        output.setText(v1.toString())

    }
    }