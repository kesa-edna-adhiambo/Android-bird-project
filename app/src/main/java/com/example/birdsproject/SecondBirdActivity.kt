package com.example.birdsproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.birdsproject.databinding.ActivityMainBinding
import com.example.birdsproject.databinding.ActivitySecondBirdBinding
import com.squareup.picasso.Picasso

class SecondBirdActivity : AppCompatActivity() {


    lateinit var binding: ActivitySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev.setOnClickListener{
            finish()
        }

        binding.btnNext2.setOnClickListener{
            val intent = Intent(this, ThirdBirdActivity::class.java)
            startActivity(intent)
        }
        Picasso.get()
            .load("https://images.unsplash.com/photo-1508627749788-88ede8434b39?q=80&w=1885&auto=format&fit=crop&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D")
            .fit()
            .into(binding.imageView2)
    }
}








