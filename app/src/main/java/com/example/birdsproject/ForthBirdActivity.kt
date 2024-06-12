package com.example.birdsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birdsproject.databinding.ActivityForthBirdBinding
import com.example.birdsproject.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ForthBirdActivity : AppCompatActivity() {

    lateinit var binding: ActivityForthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev4.setOnClickListener{
            finish()
        }

        binding.btnNext4.setOnClickListener{
            val intent = Intent(this, FifthBirdsActivity::class.java)
            startActivity(intent)
        }
        Picasso.get()
            .load("https://images.unsplash.com/photo-1514561499665-1b457094c8e2?q=80&w=1814&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .fit()
            .into(binding.imageView4)
    }
}