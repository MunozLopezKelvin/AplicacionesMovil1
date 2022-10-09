package com.example.ejercicio04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }
    private fun rollDice() {
        val dado = Lanzamiento(6)
        val result = dado.lanzar()
        val img: ImageView = findViewById(R.id.imageView)
        val drawableResource = when (result) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        img.setImageResource(drawableResource)
        img.contentDescription = result.toString()
    }
}
class Lanzamiento(private val caras: Int) {
    fun lanzar(): Int {
        return (1..caras).random()
    }
}