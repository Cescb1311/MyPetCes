package com.example.mypetces

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        boton.setOnClickListener {
            val nombreMascota =nombre_Mascota.text.toString()
            if(nombreMascota.isEmpty()){
                Toast.makeText(this,"Ingresa el nombre de tu mascota",Toast.LENGTH_LONG).show()
            }else{
                Toast.makeText(this,"El nombre de la mascota es $nombreMascota",Toast.LENGTH_LONG).show()
            }
        }
    }
}