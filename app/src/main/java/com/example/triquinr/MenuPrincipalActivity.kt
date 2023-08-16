package com.example.triquinr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.triquinr.databinding.ActivityMenuPrincipalBinding

private lateinit var binding : ActivityMenuPrincipalBinding
class MenuPrincipalActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.ticTacToe.setOnClickListener(){
            var intent = Intent(baseContext, TriquiActivity::class.java)
            startActivity(intent)
        }
        binding.randomGreet.setOnClickListener(){
            val selSpinner = binding.idioma.selectedItem.toString()
            var intent = Intent(baseContext, GreetActivity::class.java)
            intent.putExtra("seleccion", selSpinner)
            startActivity(intent)
        }
        }
    }