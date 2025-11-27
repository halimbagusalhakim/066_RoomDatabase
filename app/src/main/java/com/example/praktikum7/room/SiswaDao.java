package com.example.praktikum7.room;

import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;
import java.util.concurrent.Flow;

@Dao
interface SiswaDao {
    @Query("SELECT * FROM tblSiswa ORDER BY nama ASC")
    fun getAllSiswa(): Flow<List<Siswa>>
}
