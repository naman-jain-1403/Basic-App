package com.example.evaluation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener{
            val msg = edittxt.text.toString()
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("msg",msg)
            startActivity(intent)
        }
    }
}