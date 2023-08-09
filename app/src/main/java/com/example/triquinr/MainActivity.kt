package com.example.triquinr

import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.triquinr.databinding.ActivityMainBinding

private lateinit var binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val colorInicial = ColorStateList.valueOf(Color.BLACK)
        val colorUno = ColorStateList.valueOf(Color.RED)
        val colorDos = ColorStateList.valueOf(Color.BLUE)
        var posiciones = IntArray(9) { index -> 0 + index }
        var cont: Int = 0
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button10.setOnClickListener(){
            cont = 0
            posiciones = IntArray(9) { index -> 0 + index }

            binding.button1.text = " "
            binding.button2.text = " "
            binding.button3.text = " "
            binding.button4.text = " "
            binding.button5.text = " "
            binding.button6.text = " "
            binding.button7.text = " "
            binding.button8.text = " "
            binding.button9.text = " "

            binding.button1.backgroundTintList  = colorInicial
            binding.button2.backgroundTintList  = colorInicial
            binding.button3.backgroundTintList  = colorInicial
            binding.button4.backgroundTintList  = colorInicial
            binding.button5.backgroundTintList  = colorInicial
            binding.button6.backgroundTintList  = colorInicial
            binding.button7.backgroundTintList  = colorInicial
            binding.button8.backgroundTintList  = colorInicial
            binding.button9.backgroundTintList  = colorInicial

            binding.button1.isEnabled = true;
            binding.button2.isEnabled = true;
            binding.button3.isEnabled = true;
            binding.button4.isEnabled = true;
            binding.button5.isEnabled = true;
            binding.button6.isEnabled = true;
            binding.button7.isEnabled = true;
            binding.button8.isEnabled = true;
            binding.button9.isEnabled = true;

            binding.button1.isClickable = true
            binding.button2.isClickable = true
            binding.button3.isClickable = true
            binding.button4.isClickable = true
            binding.button5.isClickable = true
            binding.button6.isClickable = true
            binding.button7.isClickable = true
            binding.button8.isClickable = true
            binding.button9.isClickable = true
        }

        binding.button1.setOnClickListener(){
            if(cont%2==0){
                posiciones[0] = -1
                binding.button1.backgroundTintList = colorUno
                binding.button1.text = "X"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Uno ganó", Toast.LENGTH_LONG).show()
                }
            } else{
                binding.button1.backgroundTintList = colorDos
                posiciones[0] = -2
                binding.button1.text = "O"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Dos ganó", Toast.LENGTH_LONG).show()
                }
            }
            cont++
            binding.button1.isClickable = false
        }
        binding.button2.setOnClickListener(){
            if(cont%2==0){
                binding.button2.backgroundTintList = colorUno
                posiciones[1] = -1
                binding.button2.text = "X"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Uno ganó", Toast.LENGTH_LONG).show()
                }
            } else{
                binding.button2.backgroundTintList = colorDos
                posiciones[1] = -2
                binding.button2.text = "O"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Dos ganó", Toast.LENGTH_LONG).show()
                }
            }
            cont++
            binding.button2.isClickable = false
        }

        binding.button3.setOnClickListener(){
            if(cont%2==0){
                binding.button3.backgroundTintList = colorUno
                posiciones[2] = -1
                binding.button3.text = "X"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Uno ganó", Toast.LENGTH_LONG).show()
                }
            } else{
                binding.button3.backgroundTintList = colorDos
                posiciones[2] = -2
                binding.button3.text = "O"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Dos ganó", Toast.LENGTH_LONG).show()
                }
            }
            cont++
            binding.button3.isClickable = false
        }

        binding.button4.setOnClickListener(){
            if(cont%2==0){
                binding.button4.backgroundTintList = colorUno
                posiciones[3] = -1
                binding.button4.text = "X"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Uno ganó", Toast.LENGTH_LONG).show()
                }
            } else{
                binding.button4.backgroundTintList = colorDos
                posiciones[3] = -2
                binding.button4.text = "O"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Dos ganó", Toast.LENGTH_LONG).show()
                }
            }
            cont++
            binding.button4.isClickable = false
        }

        binding.button5.setOnClickListener(){
            if(cont%2==0){
                binding.button5.backgroundTintList = colorUno
                posiciones[4] = -1
                binding.button5.text = "X"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Uno ganó", Toast.LENGTH_LONG).show()
                }
            } else{
                binding.button5.backgroundTintList = colorDos
                posiciones[4] = -2
                binding.button5.text = "O"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Dos ganó", Toast.LENGTH_LONG).show()
                }
            }
            cont++
            binding.button5.isClickable = false
        }

        binding.button6.setOnClickListener(){
            if(cont%2==0){
                binding.button6.backgroundTintList = colorUno
                posiciones[5] = -1
                binding.button6.text = "X"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Uno ganó", Toast.LENGTH_LONG).show()
                }
            } else{
                binding.button6.backgroundTintList = colorDos
                posiciones[5] = -2
                binding.button6.text = "O"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Dos ganó", Toast.LENGTH_LONG).show()
                }
            }
            cont++
            binding.button6.isClickable = false
        }

        binding.button7.setOnClickListener(){
            if(cont%2==0){
                binding.button7.backgroundTintList = colorUno
                posiciones[6] = -1
                binding.button7.text = "X"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Uno ganó", Toast.LENGTH_LONG).show()
                }
            } else{
                binding.button7.backgroundTintList = colorDos
                posiciones[6] = -2
                binding.button7.text = "O"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Dos ganó", Toast.LENGTH_LONG).show()
                }
            }
            cont++
            binding.button7.isClickable = false
        }

        binding.button8.setOnClickListener(){
            if(cont%2==0){
                binding.button8.backgroundTintList = colorUno
                posiciones[7] = -1
                binding.button8.text = "X"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Uno ganó", Toast.LENGTH_LONG).show()
                }
            } else{
                binding.button8.backgroundTintList = colorDos
                posiciones[7] = -2
                binding.button8.text = "O"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Dos ganó", Toast.LENGTH_LONG).show()
                }
            }
            cont++
            binding.button8.isClickable = false
        }

        binding.button9.setOnClickListener(){
            if(cont%2==0){
                binding.button9.backgroundTintList = colorUno
                posiciones[8] = -1
                binding.button9.text = "X"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Uno ganó", Toast.LENGTH_LONG).show()
                }
            } else{
                binding.button9.backgroundTintList = colorDos
                posiciones[8] = -2
                binding.button9.text = "O"
                if(gano(posiciones)){
                    bloquear()
                    Toast.makeText(baseContext, "El Jugador Dos ganó", Toast.LENGTH_LONG).show()
                }
            }
            cont++
            binding.button9.isClickable = false
        }
    }
}

fun gano(posiciones: IntArray):Boolean{
    if(posiciones[0]==posiciones[1] && posiciones[0]==posiciones[2]){
        return true
    } else if(posiciones[3]==posiciones[4] && posiciones[3]==posiciones[5]){
        return true
    } else if(posiciones[6]==posiciones[7] && posiciones[6]==posiciones[8]){
        return true
    } else if(posiciones[0]==posiciones[3] && posiciones[0]==posiciones[6]){
        return true
    } else if(posiciones[1]==posiciones[4] && posiciones[1]==posiciones[7]){
        return true
    } else if(posiciones[2]==posiciones[5] && posiciones[2]==posiciones[8]){
        return true
    } else if(posiciones[0]==posiciones[4] && posiciones[0]==posiciones[8]){
        return true
    } else if(posiciones[2]==posiciones[4] && posiciones[2]==posiciones[6]){
        return true
    }
    return false
}

fun bloquear(){
    binding.button1.isEnabled = false;
    binding.button2.isEnabled = false;
    binding.button3.isEnabled = false;
    binding.button4.isEnabled = false;
    binding.button5.isEnabled = false;
    binding.button6.isEnabled = false;
    binding.button7.isEnabled = false;
    binding.button8.isEnabled = false;
    binding.button9.isEnabled = false;
}