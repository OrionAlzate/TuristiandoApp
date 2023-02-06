package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Hoteles extends AppCompatActivity {

    ArrayList<Hotel> listaHoteles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);



        IniciarRecycler();
    }
    // metodo para agregar listado de hoteles, incluir los datos
    public void IniciarRecycler(){
    listaHoteles = new ArrayList<Hotel>();
    listaHoteles.add(new Hotel(R.drawable.hotel3,"Hotel 12-56","$150.000"));
    listaHoteles.add(new Hotel(R.drawable.hotel4,"Hotel Balcones","$140.000"));
    listaHoteles.add(new Hotel(R.drawable.hotel1,"Hotel Campestre","$185.000"));
    listaHoteles.add(new Hotel(R.drawable.hotel2,"Hotel Zona Rosa","$225.000"));

//      adaptador para el recyclerView
        Adaptador adaptador = new Adaptador(listaHoteles);
        RecyclerView recyclerView = findViewById(R.id.recycler);
//      recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adaptador);

    }
}