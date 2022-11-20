package com.example.android.dubugging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val helloText: TextView = findViewById(R.id.hello_world)
        helloText.text = "Hello debugging"
        setContentView(R.layout.activity_main)
        logging()
        division()
    }
}

fun logging() {
    Log.v(TAG, "Hello World!")
}

fun division() {
    val numerator = 60
    var denominator = 4
    repeat(4) {
        Log.v(TAG, "${numerator/denominator}")
        Log.d(TAG, "$denominator")
        denominator--
    }
}