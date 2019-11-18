package com.example.ph

import android.os.Bundle
import android.view.View
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity

import kotlinx.android.synthetic.main.activity_main3.*
import kotlinx.android.synthetic.main.content_main2.*
import kotlinx.android.synthetic.main.content_main2.output
import kotlinx.android.synthetic.main.content_main3.*

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        setSupportActionBar(toolbar)


    }
    fun oncl (v : View) {
        var  aa   = in1.text.toString().toFloat()
        var bb   = in2.text.toString().toFloat()
        var d : Float = aa * bb
        output.setText(d.toString())
    }
}
