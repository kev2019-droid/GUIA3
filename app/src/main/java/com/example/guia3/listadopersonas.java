package com.example.guia3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import static com.example.guia3.MainActivity.listpersonas;

public class listadopersonas extends AppCompatActivity {
    ListView lstvPersonas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listadopersonas);
        addpersona();
        lstvPersonas = findViewById(R.id.lstvPersonas);
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,listpersonas);
        lstvPersonas.setAdapter(adaptador);
    }
    public void addpersona(){

            Bundle b = getIntent().getExtras();
            String nombre = b.getString("nombre1");
            listpersonas.add(nombre);

    }
    public void Principal(View view){
        finish();
    }
}
