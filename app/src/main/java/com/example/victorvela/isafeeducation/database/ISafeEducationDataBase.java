package com.example.victorvela.isafeeducation.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.victorvela.isafeeducation.DAO.AdministradorDAO;
import com.example.victorvela.isafeeducation.DAO.AlunoDAO;
import com.example.victorvela.isafeeducation.DAO.ExemploDAO;
import com.example.victorvela.isafeeducation.DAO.ProfessorDAO;
import com.example.victorvela.isafeeducation.model.Administrador;
import com.example.victorvela.isafeeducation.model.Aluno;
import com.example.victorvela.isafeeducation.model.Exemplo;
import com.example.victorvela.isafeeducation.model.Professor;

@Database(entities = {Administrador.class, Professor.class, Aluno.class, Exemplo.class},version = 1)
public abstract class ISafeEducationDataBase extends RoomDatabase {
    private static volatile ISafeEducationDataBase INSTANCE;
    public abstract AdministradorDAO administradorDAO();
    public abstract ProfessorDAO professorDAO();
    public abstract AlunoDAO alunoDAO();
    public abstract ExemploDAO exemploDAO();

    public static ISafeEducationDataBase getDatabase(final Context context){
        if(INSTANCE == null){
            synchronized (ISafeEducationDataBase.class){
                if(INSTANCE == null){
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),ISafeEducationDataBase.class,"safe_database").allowMainThreadQueries().build();
                }
            }
        }
        return INSTANCE;
    }

}
