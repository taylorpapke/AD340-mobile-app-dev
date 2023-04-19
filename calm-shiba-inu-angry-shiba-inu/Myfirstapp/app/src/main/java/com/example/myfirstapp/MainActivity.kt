package com.example.myfirstapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId", "SetTextI18n", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView: ImageView = findViewById(R.id.imageView)

        val touch: Button = findViewById(R.id.button)
        val food: Button = findViewById(R.id.button2)

        touch.setOnClickListener {
            imageView.setImageResource(R.drawable.angry_shiba)
            val text = "Don't touch the shiba when it is hungry!"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)

            toast.show()
    }
        food.setOnClickListener {
            imageView.setImageResource(R.drawable.image_3)
            val text = "Great! You fed the shiba and it is happy"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, text, duration)

            toast.show()
        }
    }
}
