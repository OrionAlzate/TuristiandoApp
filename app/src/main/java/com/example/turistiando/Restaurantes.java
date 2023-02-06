package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class Restaurantes extends AppCompatActivity {

    ArrayList<Restaurante> listaRestaurantes;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        IniciarRecycler();


    }

    private void IniciarRecycler() {
    listaRestaurantes = new ArrayList<Restaurante>();
    listaRestaurantes.add(new Restaurante(R.drawable.restaurante1,"Restaurante Mi Casa", "Cra 43 # 45 - 21"));
    listaRestaurantes.add(new Restaurante(R.drawable.restaurante2,"Restaurante Titiribi", "Diag 55 # 22f - 121"));
    listaRestaurantes.add(new Restaurante(R.drawable.restaurante3,"Restaurante el mirador", "calle 1 # 25 - 33"));
    listaRestaurantes.add(new Restaurante(R.drawable.restaurante4,"Restaurante amaya", "Parque principal Titiribi"));

    AdaptadorRest adaptadorRest = new AdaptadorRest(listaRestaurantes);
        RecyclerView recyclerView = findViewById(R.id.recyclerRest);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(adaptadorRest);


    }
}