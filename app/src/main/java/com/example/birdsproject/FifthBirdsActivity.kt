package com.example.birdsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birdsproject.databinding.ActivityFifthBirdsBinding
import com.example.birdsproject.databinding.ActivityThirdBirdBinding
import com.squareup.picasso.Picasso

class FifthBirdsActivity : AppCompatActivity() {

    lateinit var binding: ActivityFifthBirdsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFifthBirdsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev5.setOnClickListener{
            finish()
        }
        Picasso.get()
            .load("https://images.unsplash.com/photo-1480044965905-02098d419e96?q=80&w=2070&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .fit()
            .into(binding.imageView5)
    }
}