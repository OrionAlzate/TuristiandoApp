package com.example.turistiando;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AdaptadorRest extends RecyclerView.Adapter<AdaptadorRest.viewHolder> {

    public ArrayList<Restaurante> listaRestaurante;

    public AdaptadorRest(ArrayList<Restaurante> listaRestaurante) {
        this.listaRestaurante = listaRestaurante;
    }


    @NonNull
    @Override
    public AdaptadorRest.viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View vista = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item2, null,false);

        return new viewHolder(vista);
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRest.viewHolder viewHolder, int i) {
        viewHolder.actualizarDatos(listaRestaurante.get(i));
    }

    @Override
    public int getItemCount() {
        return listaRestaurante.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{

        ImageView fotoRestaurante;
        TextView nombreRestaurante;
        TextView direccionRestaurante;


        public viewHolder(@NonNull View itemView) {
            super(itemView);

            fotoRestaurante = itemView.findViewById(R.id.fotoRestaurante);
            nombreRestaurante = itemView.findViewById((R.id.nombreRestaurante));
            direccionRestaurante = itemView.findViewById(R.id.direccionRestaurante);

        }

        public void actualizarDatos(Restaurante restaurante){
            fotoRestaurante.setImageResource(restaurante.getFotografia());
            nombreRestaurante.setText((restaurante.getNombre()));
            direccionRestaurante.setText(restaurante.getDireccion());
        }
    }
}
