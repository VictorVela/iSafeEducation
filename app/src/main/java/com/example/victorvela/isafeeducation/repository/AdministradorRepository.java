package com.example.victorvela.isafeeducation.repository;

import android.content.Context;

import com.example.victorvela.isafeeducation.DAO.AdministradorDAO;
import com.example.victorvela.isafeeducation.database.ISafeEducationDataBase;
import com.example.victorvela.isafeeducation.model.Administrador;

import java.util.List;

public class AdministradorRepository {
    private AdministradorDAO mAdministradorDAO;
    private List<Administrador> mAdministradores;

    public AdministradorRepository(Context context){
        ISafeEducationDataBase db = ISafeEducationDataBase.getDatabase(context);
        mAdministradorDAO = db.administradorDAO();
    }

    /**
     * sistema de insert do repository
     */
}
