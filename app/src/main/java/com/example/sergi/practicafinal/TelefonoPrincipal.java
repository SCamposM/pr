package com.example.sergi.practicafinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class TelefonoPrincipal extends Practica {

    EditText infotelefono;
    Button Aceptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityintent);

        infotelefono = (EditText) findViewById(R.id.infotelefono);

        Aceptar = (Button) findViewById(R.id.Aceptar);

    }

    public void onClickAceptar(View view){


        String aux_telefono = infotelefono.getText().toString();


        if(!aux_telefono.matches("")) {

            Intent i = new Intent(this, TelefonoFinal.class);
            i.putExtra("telefono", aux_telefono);
            startActivity(i);
        }
        else{
            Toast.makeText(getApplicationContext(), "Debe ingresar datos", Toast.LENGTH_SHORT).show();
        }
    }

}