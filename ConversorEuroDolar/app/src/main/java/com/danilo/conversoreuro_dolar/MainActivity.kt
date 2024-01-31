package com.danilo.conversoreuro_dolar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.danilo.conversoreuro_dolar.databinding.ActivityMainBinding
import kotlin.math.roundToInt

class MainActivity : AppCompatActivity() {

    private lateinit var  binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            val euros = binding.editEuro.text.toString().toDouble()
            //val dolares = String.format("%.2f", euros * 0.8)

            val dolares = (euros * 0.8 * 100).roundToInt().toDouble() / 100;

            binding.textDolares.text = "${ dolares }$"
        }
    }
}