package com.example.agendaprincipal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

Button btInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btInicio = findViewById(R.id.cadastro);
        // R é uma classe do android studio que guarda todos os arquivos
        // como se fosse uma anotação, o . serve para escolher qual função você quer
        // usar para o R, no caso vamos guardar referente ao ID.
        btInicio.setOnClickListener(new View.OnClickListener() {
            // ele "ouve" se o botão foi clicado ou não. Como se fosse lógica de programação TRUE
            // Se ele clicar, o programa lê como verdadeiro e faz uma "anotação.
            @Override
            public void onClick(View v) {
                abreSegundaTela();
            }
        });
    }

    private void abreSegundaTela() {
        Intent it = new Intent(this, Cadastro2.class);
// instacio atributo it para uma classe intent
        startActivityForResult(it, 1);
    }

}