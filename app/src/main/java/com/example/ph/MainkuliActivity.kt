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
        var v: Float = 0f
        if (input7.text.toString() == "") {
            var a = input5.text.toString().toFloat()
            var b = input7.text.toString().toFloat()
            var d = input8.text.toString().toFloat()
            v = a / (b * d)
        }
        if (input8.text.toString() == "") {
            var b = input6.text.toString().toFloat()
            var a = input5.text.toString().toFloat()
            var c = input7.text.toString().toFloat()
            v = a / (c * b)
        }

        if (input6.text.toString() == "") {
            var a = input5.text.toString().toFloat()
            var d = input8.text.toString().toFloat()
            var c = input7.text.toString().toFloat()
            v = a / (c * d)
        }
        if (input5.text.toString() == "") {
            var b = input6.text.toString().toFloat()
            var c = input7.text.toString().toFloat()
            var d = input8.text.toString().toFloat()
            v = c * b * d
        }


        output.setText(v.toString())

    }
    }