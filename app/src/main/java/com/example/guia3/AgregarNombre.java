package com.example.guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class AgregarNombre extends AppCompatActivity {
    EditText nombre;
    String nom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_nombre);
        nombre = findViewById(R.id.edtNombre);


    }
    public void regresando(View view){
        nom = nombre.getText().toString();
        Intent m = new Intent(this,listadopersonas.class);
        m.putExtra("nombre1",nom);
        startActivity(m);
        finish();
        Toast.makeText(this,"El nombre es: "+ nom,Toast.LENGTH_LONG).show();
    }
}
