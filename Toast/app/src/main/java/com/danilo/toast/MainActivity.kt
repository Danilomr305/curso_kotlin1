package com.danilo.toast
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.danilo.toast.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonOla.setOnClickListener {
            val nome = binding.editNome.text.toString().trim()
            val snome = binding.editSobrenome.text.toString().trim()

            if( nome.isEmpty() || snome.isEmpty()) {
                binding.textResultado.text = "Nome não Inserido"
                Toast.makeText(applicationContext, "Nome não Inserido", Toast.LENGTH_SHORT).show()
            } else {
                binding.textResultado.text = "$nome $snome"
                Toast.makeText(applicationContext, "$nome $snome", Toast.LENGTH_LONG).show()
            }

        }
    }
}