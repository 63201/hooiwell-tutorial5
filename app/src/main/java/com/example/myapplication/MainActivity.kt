package com.example.myapplication

import android.graphics.drawable.AnimationDrawable
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.Toast // Import Toast class

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Get references to ImageView elements in the layout
//        val backgroundImageView = findViewById<ImageView>(R.id.backgroundImageView)
        val animationImageView = findViewById<ImageView>(R.id.animationImageView)

        // **Add button click listener here**
        val button = findViewById<Button>(R.id.my_button) // Replace "my_button" with your actual button ID
        button.setOnClickListener {
            // Code to execute when the button is clicked (e.g., show a toast message)
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
        }

        // Start the background animation
//        val backgroundAnimationDrawable = backgroundImageView.background as AnimationDrawable
//        backgroundAnimationDrawable.start()

        // Start the animation for the other images after a delay
        animationImageView.postDelayed({
            animationImageView.visibility = ImageView.VISIBLE // Make the animation ImageView
            animationImageView.setBackgroundResource(R.drawable.p1)
            val animationDrawable = animationImageView.background as AnimationDrawable
            animationDrawable.start() // Start the animation for the other images
        }, 1000) // Delay for 1000 milliseconds(1s)
    }

}
