package com.example.triquinr

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.triquinr.databinding.ActivityInfoPaisesBinding
import com.example.triquinr.datos.Pais
import com.squareup.picasso.Picasso



private lateinit var binding: ActivityInfoPaisesBinding
class InfoPaisesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInfoPaisesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val receivedPais = intent.getParcelableExtra<Pais>("PAIS")

        Log.d("URL_IMAGEN", "URL de la imagen: ${receivedPais?.bandera}")

        binding.nombre.setText("Nombre: " + receivedPais!!.nomPais)
        binding.capital.setText("Capital: " + receivedPais!!.capital)
        binding.nomInternacional.setText("Nombre Internacional: " + receivedPais!!.nomPaisInt)
        binding.sigla.setText("Siglas: " + receivedPais!!.sigla)
        Picasso.get().invalidate(receivedPais!!.bandera)
        Picasso.get()
            .load(receivedPais!!.bandera)
            .placeholder(R.drawable.carga)
            .error(R.drawable.error)
            .into(binding.bandera)
    }
}