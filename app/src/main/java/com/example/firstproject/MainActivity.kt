package com.example.firstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.btnClick)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val txtResult = findViewById<TextView>(R.id.txtFirstText)
        var timesClicked = 0

        btnClick.setOnClickListener {
//            btnClick.text="Change the message"
            if(timesClicked == 0){
                Toast.makeText(this, "When you click this button, it'll change the number", Toast.LENGTH_SHORT).show()
            }
            timesClicked += 1
            txtResult.text = timesClicked.toString()
        }

        btnReset.setOnClickListener {
            if(timesClicked == 0){
                Toast.makeText(this, "This button reset the numbers", Toast.LENGTH_SHORT).show()
            }
            timesClicked = 0
            txtResult.text = timesClicked.toString()
        }
    }
}