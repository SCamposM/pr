package com.example.sergi.practicafinal;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


public class Fitxers extends Practica {


    Button Boto1;
    Button Boto2;
    Button Boto3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fitxers);

        Boto1 = (Button) findViewById(R.id.Boto1);
        Boto2 = (Button) findViewById(R.id.Boto2);
        Boto3 = (Button) findViewById(R.id.Boto3);

    }

    public void onClickBoto1(View view1){

        Intent toy1 = new Intent(Fitxers.this,MemoriaInterna.class);

        startActivity(toy1);
    }

    public void onClickBoto2(View view2){

        Intent toy2 = new Intent(Fitxers.this,MemoriaExterna.class);

        startActivity(toy2);
    }

    public void onClickBoto3(View view3){

        Intent toy3 = new Intent(Fitxers.this,Raw.class);

        startActivity(toy3);
    }



}
