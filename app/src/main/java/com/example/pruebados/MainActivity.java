package com.example.pruebados;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewDatos;
    private RecivlerViewAdaptador adaptadorDatos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewDatos = (RecyclerView)findViewById(R.id.rvOpciones);
        recyclerViewDatos.setLayoutManager((new LinearLayoutManager(this)));

        adaptadorDatos = new RecivlerViewAdaptador(obtenerDatos());
        recyclerViewDatos.setAdapter(adaptadorDatos);
    }

    public List<Datos> obtenerDatos(){
        List<Datos> datos = new ArrayList<>();
        datos.add(new Datos("De tres litros", "$1.75",  "CC001" ));

        return datos;
    }
}