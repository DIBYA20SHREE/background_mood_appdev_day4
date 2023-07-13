package com.example.practice02

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttondark= findViewById<Button>(R.id.btn_dark)
        val buttonread= findViewById<Button>(R.id.btn_read)
        val layout= findViewById<LinearLayout>(R.id.LinearLayout)

        buttonread.setOnClickListener{
            layout.setBackgroundResource(R.color.yellow)
        }
        buttondark.setOnClickListener{
            layout.setBackgroundResource(R.color.black)
        }

    }
}