package com.example.sergi.practicafinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class ForResult2 extends ForResult {


    Button btAceptar, btCancelar;
    EditText etResulta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forresult2);
        btAceptar = (Button) findViewById(R.id.btAceptar);
        btCancelar = (Button) findViewById(R.id.btCancelar);
        etResulta = (EditText) findViewById(R.id.etResulta);

        btAceptar.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                if (etResulta.getText().length() != 0) {
                    String resultado = etResulta.getText().toString();
                    Intent i = getIntent();
                    i.putExtra("RESULTADO", resultado);
                    setResult(RESULT_OK, i);


                } else {
                    Toast.makeText(ForResult2.this,
                            "No se ha introducido nada en el campo de texto",
                            Toast.LENGTH_SHORT).show();
                }

            }
        });

        btCancelar.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);

            }
        });

    }
}




