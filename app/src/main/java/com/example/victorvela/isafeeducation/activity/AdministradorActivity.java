package com.example.victorvela.isafeeducation.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;

import com.example.victorvela.isafeeducation.R;

public class AdministradorActivity extends AppCompatActivity implements AdapterView.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administrador);


    }

    public void novoAdministrador(View view){
        Intent novoAdministrador = new Intent(AdministradorActivity.this,AdministradorCadastroActivity.class);
        startActivity(novoAdministrador);
    }

    @Override
    public void onClick(View v) {

    }
}
