package com.example.scrollbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        image1.setOnClickListener {
            appCompatImageView.setImageResource(R.drawable.img1)
        }
        image2.setOnClickListener {
            appCompatImageView.setImageResource(R.drawable.img2)
        }
        image3.setOnClickListener {
            appCompatImageView.setImageResource(R.drawable.img3)
        }
        image4.setOnClickListener {
            appCompatImageView.setImageResource(R.drawable.img4)
        }
    }
}
