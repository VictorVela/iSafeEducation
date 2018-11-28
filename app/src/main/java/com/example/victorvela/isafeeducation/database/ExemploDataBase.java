package com.example.victorvela.isafeeducation.database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import com.example.victorvela.isafeeducation.DAO.ExemploDAO;
import com.example.victorvela.isafeeducation.model.Exemplo;

@Database(entities = {Exemplo.class}, version = 1, exportSchema = false)
public abstract class ExemploDataBase extends RoomDatabase {
    public abstract ExemploDAO exemploDAO();
}
