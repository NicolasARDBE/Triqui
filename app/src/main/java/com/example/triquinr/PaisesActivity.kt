package com.example.triquinr

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.triquinr.databinding.ActivityPaisesBinding
import org.json.JSONObject
import com.example.triquinr.datos.Pais
import com.squareup.picasso.Picasso

private lateinit var binding: ActivityPaisesBinding
var paises = mutableListOf<Pais>()
class PaisesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityPaisesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        loadCountries()
        var adapter = ArrayAdapter<Pais>(baseContext, android.R.layout.simple_list_item_activated_1, paises)
        binding.listaPaises.adapter = adapter

        binding.listaPaises.setOnItemClickListener { parent, view, position, id ->
            val clickedPais = paises[position]
            val intent = Intent(this, InfoPaisesActivity::class.java)
            intent.putExtra("PAIS", clickedPais)
            startActivity(intent)
        }
    }

    fun loadCountries() {
        val json_string = this.assets.open("paises.json").bufferedReader().use{
            it.readText()
        }
        var json = JSONObject(json_string);
        var paisesJsonArray = json.getJSONArray("paises");
        for (i in 0..paisesJsonArray.length()-1) {
            val jsonObject = paisesJsonArray.getJSONObject(i)
            val capital = jsonObject.getString("capital")
            val nomPais = jsonObject.getString("nombre_pais")
            val nomPaisInt = jsonObject.getString("nombre_pais_int")
            val sigla = jsonObject.getString("sigla")
            val bandera = jsonObject.getString("bandera")
            //Crear el objeto pais y agregarlo al arreglo
            val country = Pais(nomPais, capital, nomPaisInt, sigla, bandera)
            paises.add(country)
        }
    }
}