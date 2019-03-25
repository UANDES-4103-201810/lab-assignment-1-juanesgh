package com.lab.juanrodriguez.lab1_2019

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendInfo(view: View){
        val n1 = findViewById<EditText>(R.id.editText)
        val user = n1.text.toString()
        val n2 = findViewById<EditText>(R.id.editText2)
        val pass = n2.text.ToString()
        val intent = Intent().apply{
            putExtra(EXTRA_MESSAGE, user)
            putExtra(EXTRA_MESSAGE, pass)
        }
        startActivity(intent)
    }
}
