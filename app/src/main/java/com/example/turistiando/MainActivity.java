package com.example.turistiando;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // atributos

    // metodos
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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
                Toast.makeText(this, "opcion 1", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(getApplicationContext(),AcercaDe.class);
                startActivity(intent);

                break;
            case(R.id.option2):
                Toast.makeText(this, "opcion 2", Toast.LENGTH_SHORT).show();
                break;
            case(R.id.option3):
                Toast.makeText(this, "opcion 3", Toast.LENGTH_SHORT).show();
                break;
        }

        return super.onOptionsItemSelected(item);
    }
}