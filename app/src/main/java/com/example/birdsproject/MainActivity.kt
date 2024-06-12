package com.example.birdsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birdsproject.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnNext.setOnClickListener{
            val intent = Intent(this, SecondBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://i.pinimg.com/474x/17/32/cc/1732cceef56b6c22de807d067ab6d014.jpg")
            .into(binding.imageView)
    }
}
