package com.example.myfirstapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val areTextView: TextView = findViewById(R.id.textView2)

        val increment: Button = findViewById(R.id.button)
        val decrement: Button = findViewById(R.id.button2)
        val reset: Button = findViewById(R.id.button3)

        increment.setOnClickListener {
            var oldText = areTextView.text
            areTextView.text = "" + (Integer.parseInt(areTextView.text.toString()) + 1)
            var newText = areTextView.text
            val text = "from $oldText to $newText"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)

            toast.show()
    }
        decrement.setOnClickListener {
            var oldText = areTextView.text
            areTextView.text = "" + (Integer.parseInt(areTextView.text.toString()) - 1)
            var newText = areTextView.text
            val text = "from $oldText to $newText"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)

            toast.show()
        }
        reset.setOnClickListener {
            var oldText = areTextView.text
            areTextView.text = "0"
            var newText = areTextView.text
            val text = "from $oldText to $newText"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)

            toast.show()
        }
    }
}
