package com.syfttny.calmcoast.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "meditation_progress")
data class MeditationProgress(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "userId") val userId: Int,
    @ColumnInfo(name = "meditationId") val meditationId: Int,
    @ColumnInfo(name = "date") val date: String,
    @ColumnInfo(name = "duration") val duration: Int,
    @ColumnInfo(name = "isCompleted") val isCompleted: Boolean,
)
