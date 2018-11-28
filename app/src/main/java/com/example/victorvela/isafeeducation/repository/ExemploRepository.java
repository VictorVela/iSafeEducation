package com.example.victorvela.isafeeducation.repository;

import android.content.Context;

import com.example.victorvela.isafeeducation.DAO.ExemploDAO;
import com.example.victorvela.isafeeducation.database.ExemploDataBase;
import com.example.victorvela.isafeeducation.database.ISafeEducationDataBase;
import com.example.victorvela.isafeeducation.model.Exemplo;

import java.util.List;

public class ExemploRepository {
    private Exemplo exemplo;
    private ExemploDAO mExemploDAO;
    private List<Exemplo> mExemplos;

    public ExemploRepository(Context context){
        ISafeEducationDataBase db = ISafeEducationDataBase.getDatabase(context);
        mExemploDAO = db.exemploDAO();
    }

    public void insert(Exemplo exemplo){
        mExemploDAO.insertOnlySingleexemplo(exemplo);
    }
}
