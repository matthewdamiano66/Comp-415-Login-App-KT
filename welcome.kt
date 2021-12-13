package com.example.p3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class welcome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val back =findViewById<Button>(R.id.back)
        val name = intent.getStringExtra("Name")
        var welcome = findViewById<TextView>(R.id.welcome)
        name.toString()
        welcome.text = "Hello '$name' you are now logged in, we hope you enjoy using the app!"
        back.setOnClickListener(){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
}