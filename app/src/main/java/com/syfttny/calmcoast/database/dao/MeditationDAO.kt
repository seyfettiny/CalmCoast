package com.syfttny.calmcoast.database.dao

import androidx.room.*
import com.syfttny.calmcoast.model.Meditation

@Dao
interface MeditationDAO {
    @Insert
    fun insert(meditation: Meditation)

    @Update
    fun update(meditation: Meditation)

    @Delete
    fun delete(meditation: Meditation)

    @Query("SELECT * FROM meditations")
    fun getAllMeditations(): List<Meditation>

    @Query("SELECT * FROM meditations WHERE id = :id")
    fun getMeditationById(id: Int): Meditation

    @Query("SELECT * FROM meditations WHERE isDownloaded = 1")
    fun getDownloadedMeditations(): List<Meditation>

    @Query("DELETE FROM meditations")
    fun deleteAllMeditations()
}