package com.syfttny.calmcoast.di

import android.app.Application
import androidx.room.Room
import com.syfttny.calmcoast.database.AppDatabase
import com.syfttny.calmcoast.database.dao.BreathingExerciseDAO
import com.syfttny.calmcoast.database.dao.MeditationDAO
import com.syfttny.calmcoast.database.dao.SoundDAO
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(application: Application): AppDatabase {
        return Room.databaseBuilder(application, AppDatabase::class.java, "app_database")
            .fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    fun provideMeditationDao(database: AppDatabase): MeditationDAO {
        return database.meditationDAO
    }

    @Provides
    fun provideBreathingExerciseDao(database: AppDatabase): BreathingExerciseDAO {
        return database.breathingExerciseDAO
    }

    @Provides
    fun provideSoundDao(database: AppDatabase): SoundDAO {
        return database.soundDAO
    }
}