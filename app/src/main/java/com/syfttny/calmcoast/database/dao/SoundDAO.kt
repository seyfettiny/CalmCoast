package com.syfttny.calmcoast.database.dao

import androidx.room.*
import com.syfttny.calmcoast.model.Sound

@Dao
interface SoundDAO {
    @Insert
    fun insert(sound: Sound)

    @Update
    fun update(sound: Sound)

    @Delete
    fun delete(sound: Sound)

    @Query("SELECT * FROM sounds")
    fun getAllSounds(): List<Sound>

    @Query("SELECT * FROM sounds WHERE id = :id")
    fun getSoundById(id: Int): Sound

    @Query("SELECT * FROM sounds WHERE isDownloaded = 1")
    fun getDownloadedSounds(): List<Sound>

    @Query("DELETE FROM sounds")
    fun deleteAllSounds()
}