package com.example.triquinr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triquinr.databinding.ActivityGreetBinding

private lateinit var binding: ActivityGreetBinding
class GreetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityGreetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val seleccion = getIntent().getStringExtra("seleccion")
        when (seleccion) {
            "Francés" -> {
                binding.saludo.setText("Salut")
            }
            "Alemán" -> {
                binding.saludo.setText("Halo")
            }
            "Español" -> {
                binding.saludo.setText("Hola")
            }
            "Italiano" -> {
                binding.saludo.setText("Ciao")
            }
            "Portugués" -> {
                binding.saludo.setText("Oi")
            }
            else -> {
                binding.saludo.setText("Selección Invalida")
            }
        }
    }
}