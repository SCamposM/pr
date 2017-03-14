package com.example.sergi.practicafinal;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MemoriaInterna extends Fitxers {
    private EditText textBox;
    static final int READ_BLOCK_SIZE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.memoriainterna);

        textBox = (EditText) findViewById(R.id.txtText1);
    }

    public void onClickGuardar(View v){
        String str = textBox.getText().toString();
        try{
            FileOutputStream fos = openFileOutput("textFile.txt", MODE_PRIVATE);
            OutputStreamWriter osw = new OutputStreamWriter(fos);

            // Escribimos el String en el archivo
            osw.write(str);
            osw.flush();
            osw.close();

            // Mostramos que se ha guardado
            Toast.makeText(getBaseContext(), "Guardado en Data/Data/com.example.sergi.practicafinal", Toast.LENGTH_SHORT).show();

            textBox.setText("");
        }catch (IOException ex){
            ex.printStackTrace();
        }

    }

}