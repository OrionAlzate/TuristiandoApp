package com.example.turistiando;

public class Restaurante {

    private int fotografia;
    private String nombre;
    private String direccion;



    public Restaurante(int fotografia, String nombre, String direccion) {
        this.fotografia = fotografia;
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public int getFotografia() {
        return fotografia;
    }

    public void setFotografia(int fotografia) {
        this.fotografia = fotografia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
