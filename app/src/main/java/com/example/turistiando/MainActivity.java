package com.example.turistiando;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    // atributos

    // metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // cambiar color del actionBar
        ActionBar barra = getSupportActionBar();
        // asignar un color el color del actionbar
        ColorDrawable colorBarra = new ColorDrawable(Color.parseColor("#ed7607"));
        barra.setBackgroundDrawable(colorBarra);


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
    public boolean onCreateOptionsMenu(Menu menudo) {
        //cargar el menu desde los recursos
        getMenuInflater().inflate(R.menu.menu,menudo);
        return true;
    }

    //Dar funcionamiento al menu
    public boolean onOptionsItemSelected(MenuItem item) {

        // observamos a que item del menu le damos click
        int itemSeleccionado = item.getItemId();

        switch (itemSeleccionado){
            case(R.id.option1):
                
                Intent intent = new Intent(getApplicationContext(),AcercaDe.class);
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