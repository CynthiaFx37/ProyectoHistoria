package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RespuestaIncorrectaB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_respuesta_incorrecta_b);
    }

    public void Iniciar(View view){
        Intent iniciar = new Intent(this, Pregunta4.class);
        startActivity(iniciar);

    }
}