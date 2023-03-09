package com.syfttny.calmcoast.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.syfttny.calmcoast.database.dao.BreathingExerciseDAO
import com.syfttny.calmcoast.database.dao.MeditationDAO
import com.syfttny.calmcoast.database.dao.SoundDAO
import com.syfttny.calmcoast.model.BreathingExercise
import com.syfttny.calmcoast.model.Meditation
import com.syfttny.calmcoast.model.Sound

@Database(entities = [Meditation::class, Sound::class, BreathingExercise::class], version = 1)
abstract class AppDatabase : RoomDatabase() {

    abstract val meditationDAO: MeditationDAO
    abstract val soundDAO: SoundDAO
    abstract val breathingExerciseDAO: BreathingExerciseDAO
}