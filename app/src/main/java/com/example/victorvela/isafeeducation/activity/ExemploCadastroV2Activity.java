package com.example.victorvela.isafeeducation.activity;

import android.arch.persistence.room.Room;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.victorvela.isafeeducation.R;
import com.example.victorvela.isafeeducation.database.ExemploDataBase;

public class ExemploCadastroV2Activity extends AppCompatActivity {

    private static final String DATABASE_NAME = "exemplo_db";
    private ExemploDataBase exemploDataBase;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exemplo_cadastro_v2);
    }
}
