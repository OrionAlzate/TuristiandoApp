package com.example.turistiando;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    // atributos
    ImageButton btnHoteles;
    ImageButton btnRestaurante;


    // metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // cambiar color del actionBar
        ActionBar barra = getSupportActionBar();
        // asignar un color el color del actionbar
        ColorDrawable colorBarra = new ColorDrawable(Color.parseColor("#636363"));
        barra.setBackgroundDrawable(colorBarra);

        //Asociando los botones a eventos de click (escuchar click)
        btnHoteles = findViewById(R.id.iconoHoteles);
        btnRestaurante = findViewById(R.id.iconRestaurante);

        // añadir evento click al btnHoteles
        btnHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intentHoteles = new Intent(MainActivity.this, Hoteles.class);
                startActivity(intentHoteles);

            }
        });

        btnRestaurante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentRest = new Intent(MainActivity.this, Restaurantes.class);
                startActivity(intentRest);

            }
        });





    }

    //Metodo para cambiar el idioma de mi app
    public void cambiarIdioma(String idioma){

        //configurando el lenguaje del telefono
        Locale lenguaje = new Locale(idioma);
        //Asignar el idioma
        Locale.setDefault(lenguaje);

        //configuracion en el telefono
        Configuration configuracionTelefono = getResources().getConfiguration();
        configuracionTelefono.locale = lenguaje;

        //Ejecutamos la configuracion
        getBaseContext().getResources().updateConfiguration(configuracionTelefono, getBaseContext().getResources().getDisplayMetrics());


    }


    //metodo de creacion del menu que creamos con xml
    public boolean onCreateOptionsMenu(Menu menu) {
        //cargar el menu desde los recursos
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    //Dar funcionamiento al menu
    public boolean onOptionsItemSelected(MenuItem item) {

        // observamos a que item del menu le damos click
        int itemSeleccionado = item.getItemId();

        switch (itemSeleccionado){
            case(R.id.option1):

                Intent intent = new Intent(MainActivity.this,AcercaDe.class);
                startActivity(intent);

                break;
            case(R.id.option2):

                this.cambiarIdioma("en");
                Intent intent1 = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent1);

                break;
            case(R.id.option3):

                this.cambiarIdioma("es");
                Intent intent2 = new Intent(MainActivity.this, MainActivity.class);
                startActivity(intent2);

                break;
        }

        return super.onOptionsItemSelected(item);
    }
}