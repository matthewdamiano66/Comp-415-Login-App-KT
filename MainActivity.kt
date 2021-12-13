package com.example.p3
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.io.InputStream
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name = findViewById<TextView>(R.id.username)
        var login = findViewById<Button>(R.id.go)
        var password = findViewById<TextView>(R.id.password)
        name.toString()
        login.setOnClickListener(){
            val correctUsername: InputStream = this.resources.openRawResource(R.raw.username)
            val UserString = correctUsername.bufferedReader().use {
                it.readText()
            }
            val correctPassword: InputStream = this.resources.openRawResource(R.raw.password)
            val PassString = correctPassword.bufferedReader().use {
                it.readText()
            }
            val inputName = name.text
            val inputPass =  password.text
            if (inputName.toString() == ""){
                name.setError("Username is required")
            }
            if (inputPass.toString() == ""){
                password.setError("Password is required")
            }
            if (inputName.toString() == UserString && inputPass.toString() == PassString) {
                val intent = Intent(this, welcome::class.java)
                intent.putExtra("Name", UserString)
                startActivity(intent)
            }
            else if (inputPass.toString() != "" && inputName.toString() != ""){
                password.setError("Either the username or Password is incorrect")

            }
            else if((inputPass.toString() != "" && inputName.toString() == "")) {
                password.setError(null)
            }
        }
    }
}

