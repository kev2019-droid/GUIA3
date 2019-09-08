package com.example.guia3;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    public static List<String> listpersonas;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listpersonas = new ArrayList<String>();

    }


    public void misdatos(View view){
        Intent u = new Intent(this,Misdatos.class);
        startActivity(u);
    }
    public void Agregarnombre(View view){
        Intent in = new Intent(this,AgregarNombre.class);
        startActivity(in);
    }
    public void VerLista(View view){
        if(listpersonas == null || listpersonas.size() == 0){
            new AlertDialog.Builder(this).setTitle("¡Aviso!").setMessage("La lista está vacía").show();

        }
        else{
            Intent nu = new Intent(this, listadopersonas.class);
            startActivity(nu);
        }
    }
}
