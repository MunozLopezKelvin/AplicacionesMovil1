package com.example.ejercicio2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)

        rollButton.setOnClickListener { rollDice() }

    }

    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dado = Lanzamiento(6)
        val result = dado.lanzar()

        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = result.toString()
    }
}

class Lanzamiento(private val caras: Int) {

    fun lanzar(): Int {
        return (1..caras).random()
    }
}