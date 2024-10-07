package com.example.practica005

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var mail: EditText
    private lateinit var password: EditText
    private  lateinit var btnAceptar: Button
    private lateinit var btnCancelar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mail = findViewById(R.id.edtCorreo)
        password = findViewById(R.id.edtContraseña)
        btnAceptar = findViewById(R.id.btnAceptar)
        btnCancelar = findViewById(R.id.btnCancelar)

        btnAceptar.setOnClickListener(){
            ingresarMenu()
        }

        btnCancelar.setOnClickListener(){
            limpiarCampos()
        }
    }

    fun ingresarMenu(){
        val usr = mail.text.toString().trim()
        val con = password.text.toString().trim()

        if (usr == "admin" && con == "12345") {
            val intent = Intent (this, MenuLateralActivity::class.java)
            startActivity(intent)
        } else {
            Toast.makeText(this, "Datos incorrectos, intenta de nuevo.", Toast.LENGTH_SHORT).show()
        }
    }

    fun limpiarCampos (){
        mail.text.clear()
        password.text.clear()
        mail.requestFocus()
    }

}