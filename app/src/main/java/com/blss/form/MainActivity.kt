package com.blss.form

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var btnSubmit: Button
    lateinit var name: EditText
    lateinit var age: EditText
    lateinit var phone: EditText
    lateinit var email: EditText
    lateinit var dir: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Inicializar vistas
        btnSubmit = findViewById(R.id.btnSubmit)
        name = findViewById(R.id.editTextName)
        age = findViewById(R.id.editTextAge)
        phone = findViewById(R.id.editTextPhone)
        email = findViewById(R.id.editTextEmail)
        dir = findViewById(R.id.editTextDirection)

        btnSubmit.setOnClickListener { validateInputs() }
    }

    fun validateInputs() {
        val nameValue = name.text.toString()
        val ageValue = age.text.toString()
        val phoneValue = phone.text.toString()
        val emailValue = email.text.toString()
        val dirValue = dir.text.toString()

        if (nameValue.isEmpty() || ageValue.isEmpty() || phoneValue.isEmpty() || emailValue.isEmpty() || dirValue.isEmpty()) {
            Toast.makeText(this, "Ninguno de los campos puede estar vacío", Toast.LENGTH_SHORT).show()
        } else {
            val intent = Intent(this, activity_display::class.java)
            intent.putExtra("nombre", nameValue)
            intent.putExtra("edad", ageValue)
            intent.putExtra("telefono", phoneValue)
            intent.putExtra("correo", emailValue)
            intent.putExtra("direcc", dirValue)
            startActivity(intent)
        }
    }

}