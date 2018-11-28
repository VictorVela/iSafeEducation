package com.example.victorvela.isafeeducation.repository;

import android.content.Context;
import android.os.AsyncTask;
import android.widget.Toast;

import com.example.victorvela.isafeeducation.DAO.AdministradorDAO;
import com.example.victorvela.isafeeducation.database.ISafeEducationDataBase;
import com.example.victorvela.isafeeducation.model.Administrador;

import java.util.List;

public class AdministradorRepository {
    private Administrador administrador;
    private AdministradorDAO mAdministradorDAO;
    private List<Administrador> mAdministradores;

    public AdministradorRepository(Context context){
        ISafeEducationDataBase db = ISafeEducationDataBase.getDatabase(context);
        mAdministradorDAO = db.administradorDAO();
    }

    /**
     * sistema de insert do repository
     */
    public void insert(Administrador administrador){ new insertAsyncTask(mAdministradorDAO).execute(administrador);}

    private static class insertAsyncTask extends AsyncTask<Administrador,Void,Void>{
        private  AdministradorDAO mAsyncTaskDAO;

        insertAsyncTask(AdministradorDAO dao) {mAsyncTaskDAO = dao;}

        @Override
        protected Void doInBackground(final Administrador... params){
            mAsyncTaskDAO.insert(params[0]);
            return null;
        }
    }
}
