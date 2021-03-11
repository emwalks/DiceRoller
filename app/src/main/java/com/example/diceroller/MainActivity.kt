package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

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

            val dice = Dice(6)
            val rollResult:Int = dice.roll()

            val rollResultTextView: TextView = findViewById(R.id.textView)
            rollResultTextView.text = "${rollResult}"
        }

    }
}

internal class  Dice (val numberOfSides: Int) {
    fun roll(): Int {
        return (1..numberOfSides).random()
    }
}