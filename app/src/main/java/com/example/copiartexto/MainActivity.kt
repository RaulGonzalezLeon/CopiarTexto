package com.example.copiartexto

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.copiartexto.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.boton.setOnClickListener {
            binding.saludo.text = binding.nombre.text.toString()
            Toast.makeText(this, binding.nombre.text.toString(), Toast.LENGTH_LONG).show()
        }

        binding.bLimpiar.setOnClickListener {
            binding.nombre.text.clear()
            binding.saludo.text = ""
        }


        /*
        // Referencia al boton
        var btn = findViewById<Button>(R.id.boton)

        // Referencia al cuadro de texto
        var texto = findViewById<EditText>(R.id.nombre)

        // Referencia al cuadro de saludo
        var saludo = findViewById<TextView>(R.id.saludo)

        // Referencia al boton de limpiar
        var btnLimpiar = findViewById<Button>(R.id.bLimpiar)


        btn.setOnClickListener{
            saludo.text = texto.text.toString()
        }

        btnLimpiar.setOnClickListener {
            texto.text.clear()
            saludo.text = ""
        }

         */
    }
}