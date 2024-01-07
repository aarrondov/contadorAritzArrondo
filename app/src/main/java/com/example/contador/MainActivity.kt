package com.example.contador

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    // Variables para mantener el conteo
    private var count = 0

    // Referencias a los elementos de la interfaz de usuario
    private lateinit var tvCount: TextView
    private lateinit var btnMinus: Button
    private lateinit var btnPlus: Button
    private lateinit var btnReset: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvCount = findViewById(R.id.tvCount)
        btnMinus = findViewById(R.id.btnMinus)
        btnPlus = findViewById(R.id.btnPlus)
        btnReset = findViewById(R.id.btnReset)

        btnMinus.setOnClickListener { aumentar() }
        btnPlus.setOnClickListener { disminuir() }
        btnReset.setOnClickListener { resetear() }
    }

    // Método para decrementar el contador
    private fun aumentar() {
        count--
        actualizarContador()
    }

    // Método para incrementar el contador
    private fun disminuir() {
        count++
        actualizarContador()
    }

    // Método para restablecer el contador a 0
    private fun resetear() {
        count = 0
        actualizarContador()
    }

    // Método para actualizar el texto del contador en la interfaz de usuario
    private fun actualizarContador() {
        tvCount.text = count.toString()
    }
}
