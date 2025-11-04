package com.rubayat.hello

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import coil.load
import com.rubayat.hello.databinding.ActivityDetailsBinding

class DetailsActivity : AppCompatActivity() {
    lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val image = intent.getStringExtra("image")
        val name = intent.getStringExtra("name")
        val number = intent.getStringExtra("number")

        binding.nameTv.text = name
        binding.numberTv.text = number


        if (!image.isNullOrEmpty()){
            binding.imageView.load(image)
        }else{
            binding.imageView.setImageResource(R.drawable.rub)
        }
    }
}