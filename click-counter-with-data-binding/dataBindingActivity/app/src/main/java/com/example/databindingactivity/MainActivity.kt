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

        binding.number = "0"

        binding.button01.setOnClickListener {
            binding.name = "From " + binding.number + " to " + (Integer.parseInt(binding.number.toString()) + 1)
            binding.number = "" + (Integer.parseInt(binding.number.toString()) + 1)
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, binding.name, duration)

            toast.show()
        }

        binding.button02.setOnClickListener {
            binding.name = "From " + binding.number + " to " + (Integer.parseInt(binding.number.toString()) - 1)
            binding.number = "" + (Integer.parseInt(binding.number.toString()) - 1)
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, binding.name, duration)

            toast.show()
        }

        binding.button03.setOnClickListener {
            binding.name = "From " + binding.number + " to " + (Integer.parseInt(0.toString()))
            binding.number = "0"
            val duration = Toast.LENGTH_SHORT
            val toast = Toast.makeText(applicationContext, binding.name, duration)

            toast.show()
        }
    }
}