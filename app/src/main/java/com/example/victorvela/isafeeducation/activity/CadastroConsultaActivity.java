package com.example.victorvela.isafeeducation.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.victorvela.isafeeducation.R;

public class CadastroConsultaActivity extends AppCompatActivity {

    private Button buttonSair;

    private Button buttonAdministrador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_consulta);

        buttonSair          = findViewById(R.id.sair);
        buttonAdministrador = findViewById(R.id.entrarAdministrador);

        /*
        voltar para login
         */
        buttonSair.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                finish();

            }
        });

        /*
        ir para administrador
         */
        buttonAdministrador.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(getApplicationContext(), AdministradorActivity.class);

                startActivity(intent);

            }
        });
    }
}
