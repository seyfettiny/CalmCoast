package com.syfttny.calmcoast.database.dao

import androidx.room.*
import com.syfttny.calmcoast.model.Meditation

@Dao
interface BreathingExerciseDAO {
    @Insert
    fun insert(breathingExerciseDAO: BreathingExerciseDAO)

    @Update
    fun update(breathingExerciseDAO: BreathingExerciseDAO)

    @Delete
    fun delete(breathingExerciseDAO: BreathingExerciseDAO)

    @Query("SELECT * FROM breathing_exercises")
    fun getAllBreathingExercises(): List<Meditation>

    @Query("SELECT * FROM breathing_exercises WHERE id = :id")
    fun getBreathingExerciseById(id: Int): Meditation

    @Query("SELECT * FROM breathing_exercises WHERE isDownloaded = 1")
    fun getDownloadedBreathingExercises(): List<Meditation>

    @Query("DELETE FROM breathing_exercises")
    fun deleteAllBreathingExercises()
}