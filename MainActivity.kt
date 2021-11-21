package com.example.p3
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val go =findViewById<Button>(R.id.go)
        go.setOnClickListener(){
            val intent = Intent(this,welcome::class.java)
            startActivity(intent)
        }

    }
}