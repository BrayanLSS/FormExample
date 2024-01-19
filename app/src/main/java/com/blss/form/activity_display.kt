package com.blss.form

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class activity_display : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display)

        val intent = intent
        val name = intent.getStringExtra("nombre")
        val age = intent.getStringExtra("edad")
        val tel = intent.getStringExtra("telefono")
        val corr = intent.getStringExtra("correo")
        val dir = intent.getStringExtra("direcc")


        val textViewName: TextView = findViewById(R.id.textViewName)
        textViewName.text = "Nombre: $name"

        val textViewAge: TextView = findViewById(R.id.textViewAge)
        textViewAge.text = "Edad: $age"


        val textViewTel: TextView = findViewById(R.id.textViewPhone)
        textViewTel.text = "Telefono: $tel"

        val textViewCorr: TextView = findViewById(R.id.textViewEmail)
        textViewCorr.text = "Correo: $corr"

        val textViewDir: TextView = findViewById(R.id.textViewDirection)
        textViewDir.text = "Dirección: $dir"

        val backButton = findViewById<Button>(R.id.btnRegresar)

        // Configura un OnClickListener para el botón de regreso
        backButton.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                // Cierra la actividad actual
                finish()
            }
        })


    }
}