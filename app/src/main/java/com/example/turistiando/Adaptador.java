package com.example.turistiando;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.ArrayList;

public class Adaptador extends RecyclerView.Adapter<Adaptador.viewHolder>{

    //atributos de la clase Adaptador
    public ArrayList<Hotel> listaHoteles;

    //Constructor
    public Adaptador(ArrayList<Hotel> listaHoteles) {
        this.listaHoteles = listaHoteles;
    }

    @NonNull
    @Override
    public Adaptador.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista= LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item, null, false);

        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull Adaptador.viewHolder viewHolder, int i) {

        viewHolder.actualizarDatos(listaHoteles.get(i));

    }

    @Override
    public int getItemCount() {
        return listaHoteles.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {

        //atribuos
        ImageButton fotoHotel;
        TextView nombreHotel;
        TextView precioHotel;



        public viewHolder(@NonNull View itemView) {
            super(itemView);

            fotoHotel = itemView.findViewById(R.id.fotoHotel);
            nombreHotel = itemView.findViewById(R.id.nombreHotel);
            fotoHotel = itemView.findViewById(R.id.precioHotel);


        }

        public void actualizarDatos(Hotel hotel) {
            fotoHotel.setImageResource(hotel.getFotografia());
            nombreHotel.setText(hotel.getNombre());
            precioHotel.setText(hotel.getPrecio());
        }
    }
}
