package com.example.birdsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birdsproject.databinding.ActivitySecondBirdBinding
import com.example.birdsproject.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class ThirdBirdActivity : AppCompatActivity() {

        lateinit var binding: ActivityThirdBirdBinding
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            binding = ActivityThirdBirdBinding.inflate(layoutInflater)
            setContentView(binding.root)

            binding.btnPrev2.setOnClickListener{
                finish()
            }

            binding.btnNext3.setOnClickListener{
                val intent = Intent(this, ForthBirdActivity::class.java)
                startActivity(intent)
            }
            Picasso.get()
                .load("https://images.unsplash.com/photo-1497206365907-f5e630693df0?q=80&w=2080&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
                .fit()
                .into(binding.imageView3)
        }
    }