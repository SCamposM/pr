package com.example.sergi.practicafinal;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class Practica extends AppCompatActivity {


    Button Boton1;
    Button Boton2;
    Button Boton4;
    Button Boton5;
    Button Boton6;
    Button Boton7;
    Button Boton8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.practicafinal);

        Boton1 = (Button) findViewById(R.id.Boton1);
        Boton2 = (Button) findViewById(R.id.Boton2);
        Boton4 = (Button) findViewById(R.id.Boton4);
        Boton5 = (Button) findViewById(R.id.Boton5);
        Boton6 = (Button) findViewById(R.id.Boton6);
        Boton7 = (Button) findViewById(R.id.Boton7);
        Boton8 = (Button) findViewById(R.id.Boton8);

        }

    public void onClickBoton1(View view1){

        Intent toy1 = new Intent(Practica.this,TelefonoPrincipal.class);

        startActivity(toy1);
    }

    public void onClickBoton2(View view2){


            Intent toy2 = new Intent(Practica.this, Calculadora.class);
            startActivity(toy2);
        }

    public void onClickBoton4(View view4){


        Intent toy4 = new Intent(Practica.this, Fitxers.class);
        startActivity(toy4);
    }

    public void onClickBoton5(View view5){

        Intent toy5 = new Intent(Practica.this,ForResult.class);

        startActivity(toy5);
    }

    public void onClickBoton6(View view6){

        Intent toy6 = new Intent(Practica.this,ContentProvi.class);

        startActivity(toy6);
    }

    public void onClickBoton7(View view7){

        Intent toy7 = new Intent(Practica.this,MainBroadcast.class);

        startActivity(toy7);
    }

    public void onClickBoton8(View view8){

        Intent toy8 = new Intent(Practica.this,Missatgeria.class);

        startActivity(toy8);
    }



}


