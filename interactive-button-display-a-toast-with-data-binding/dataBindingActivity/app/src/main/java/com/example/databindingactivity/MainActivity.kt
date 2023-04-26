package com.example.databindingactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.databindingactivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(
             this, R.layout.activity_main)

        binding.button01.setOnClickListener {
            binding.name = "button has been pushed"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, binding.name, duration)
            //binding.name = "goodbye"

            toast.show()
        }
    }
}