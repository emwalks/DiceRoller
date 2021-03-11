package com.example.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            /*
            val rollButtonClickedToast = Toast.makeText(this, "Dice Rolled!", Toast.LENGTH_SHORT)
            rollButtonClickedToast.show()
             */

            rollDice()

        }
    }

    private fun rollDice() {
        val dice = Dice(6)
        val rollResult: Int = dice.roll()
        val rollResultImageView: ImageView = findViewById(R.id.imageView)

        val drawableResource = when (rollResult) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6
            else -> R.id.invisible
        }

        rollResultImageView.setImageResource(drawableResource)
        rollResultImageView.contentDescription = rollResult.toString()
    }
}

internal class Dice(private val numberOfSides: Int) {
    fun roll(): Int {
        return (1..numberOfSides).random()
    }
}