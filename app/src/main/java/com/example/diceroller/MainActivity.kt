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

            val rollResultTextView: TextView = findViewById(R.id.textView)
            var numberOfFaces: IntRange = 1..6
            var rollResult:Int = numberOfFaces.random()
            rollResultTextView.text = "${rollResult}"
        }

    }
}