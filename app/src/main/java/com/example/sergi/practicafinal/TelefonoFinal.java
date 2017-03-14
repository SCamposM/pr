package com.example.sergi.practicafinal;

import android.os.Bundle;
import android.widget.TextView;

public class TelefonoFinal extends TelefonoPrincipal {

    TextView hola;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.telefonofinal);

        hola = (TextView) findViewById(R.id.hola);

        Bundle extras = getIntent().getExtras();
        String xtelefono = extras.getString("telefono");

        hola.setText("El telèfon introduit ha sigut el  " + xtelefono);

    }
}


