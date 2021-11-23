package com.example.android_lab5_4

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_lab5_4.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Picasso.get()
            .load("https://hurrytolove.ru/wp-content/uploads/2018/12/18245676.jpg")
            .into(binding.imageView)
    }
}