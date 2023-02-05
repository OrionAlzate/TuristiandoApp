package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

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
    listaRestaurantes.add(new Restaurante(R.drawable.hotel1,"Restaurante 1", "Cra 43 # 45 - 21"));
    listaRestaurantes.add(new Restaurante(R.drawable.hotel2,"Restaurante 2", "Cra 43 # 45 - 21"));
    listaRestaurantes.add(new Restaurante(R.drawable.hotel3,"Restaurante 3", "Cra 43 # 45 - 21"));
    listaRestaurantes.add(new Restaurante(R.drawable.hotel4,"Restaurante 4", "Cra 43 # 45 - 21"));

    AdaptadorRest adaptadorRest = new AdaptadorRest(listaRestaurantes);
        RecyclerView recyclerView = findViewById(R.id.recyclerRest);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        recyclerView.setAdapter(adaptadorRest);


    }
}