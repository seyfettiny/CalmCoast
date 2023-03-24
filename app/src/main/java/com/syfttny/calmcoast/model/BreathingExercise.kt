package com.syfttny.calmcoast.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "breathing_exercises")
data class BreathingExercise(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "image") val image: String,
    @ColumnInfo(name = "audioURL") val audioURL: String,
    @ColumnInfo(name = "localAudioPath") val localAudioPath: String,
    @ColumnInfo(name = "isDownloaded") val isDownloaded: Boolean = false,
    @ColumnInfo(name = "duration") val duration: Int,
    @ColumnInfo(name = "inhaleDuration") val inhaleDuration: Int,
    @ColumnInfo(name = "exhaleDuration") val exhaleDuration: Int,
    @ColumnInfo(name = "holdDuration") val holdDuration: Int,
    )
