package com.example.lightmeup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var state = R.drawable.ic_api_black_18dp
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val imageView = findViewById<ImageView>(R.id.imageView)
        imageView.setOnClickListener{
            state = when (state){
                R.drawable.ic_api_black_18dp -> R.drawable.ic_all_out_black_18dp
                R.drawable.ic_all_out_black_18dp->R.drawable.ic_api_black_18dp
                else -> R.drawable.ic_api_black_18dp
            }
            imageView.setImageDrawable(getDrawable(state))
            true
        }
    }
}