package com.example.ph

import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main2.*
import kotlinx.android.synthetic.main.content_main2.*

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.content_main2)
    }
    fun on (v : View) {
        var v : Float = 0f
        if (input3.text.toString() == "") {
            var a = input1.text.toString().toFloat()
            var b = input2.text.toString().toFloat()
            var d = input4.text.toString().toFloat()
            v = a / (b * d)
        }
        if (input4.text.toString() == ""){
            var  b   =  input2.text.toString().toFloat()
            var a   = input1.text.toString().toFloat()
            var c   = input3.text.toString().toFloat()
            v = a / (c*b)
        }

        if (input2.text.toString() == ""){
                var  a   =  input1.text.toString().toFloat()
                var d   = input4.text.toString().toFloat()
                var c   = input3.text.toString().toFloat()
           v =  a /(c*d)
        }
        if (input1.text.toString() == "") {
            var b = input2.text.toString().toFloat()
            var c = input3.text.toString().toFloat()
            var d = input4.text.toString().toFloat()
            v = c * b * d
        }


        output.setText(v.toString())
    }

}
