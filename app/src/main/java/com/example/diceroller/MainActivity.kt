package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.diceroller.databinding.ActivityMainBinding
import java.util.Random

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rollButton.setOnClickListener {
            rollDice()
        }

    }

    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        binding.resultNumber.text = "The Result Is ${randomInt.toString()} "
        binding.resultDice.setImageResource(drawableResource)
    }

}