package com.example.converter_currency

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            var et: EditText = findViewById(R.id.editText1)
            var rawdata = et.text.toString()
            var data = rawdata.toFloat()
            var rawvivod = data/74
            var vivod = rawvivod.toString()
            var etc: EditText = findViewById(R.id.editText2)
            etc.setText("${vivod} dollars")
        }
    }
}
