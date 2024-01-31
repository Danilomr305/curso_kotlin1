package com.danilo.conversordetemperatura

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.danilo.conversordetemperatura.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonConverter.setOnClickListener {
            if(!binding.editCelsius.text.toString().isEmpty()) {
                val celsius = binding.editCelsius.text.toString().toDouble()
                val fahrenheit = String.format("%.2F", celsius * 1.8 + 32)

                binding.textResultado.text = "$fahrenheit °F"
            }else {
                binding.textResultado.text = "Temperatura invalidar"
            }
        }
    }
}