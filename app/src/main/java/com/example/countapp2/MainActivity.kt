package com.example.countapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
val textView = findViewById<TextView>(R.id.textView1)
        val button = findViewById<Button>(R.id.button)
        var count = 0
        val button2 = findViewById<Button>(R.id.button2)

        button.setOnClickListener(){
            count = count+1
            textView.setText(count.toString())

        }
        button2.setOnClickListener(){
            count = 0
            textView.setText(count.toString())
        }

    }






}