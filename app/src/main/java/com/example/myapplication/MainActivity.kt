package com.example.myapplication

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Get references to ImageView elements in the layout
//        val backgroundImageView = findViewById<ImageView>(R.id.backgroundImageView)
        val animationImageView = findViewById<ImageView>(R.id.animationImageView)

        // Start the background animation
//        val backgroundAnimationDrawable = backgroundImageView.background as AnimationDrawable
//        backgroundAnimationDrawable.start()

        // Start the animation for the other images after a delay
        animationImageView.postDelayed({
            animationImageView.visibility = ImageView.VISIBLE // Make the animation ImageView
            animationImageView.setBackgroundResource(R.drawable.1)
            val animationDrawable = animationImageView.background as AnimationDrawable
            animationDrawable.start() // Start the animation for the other images
        }, 1000) // Delay for 1000 milliseconds(1s)
    }

}