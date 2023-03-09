package com.syfttny.calmcoast.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "sounds")
data class Sound(
    @PrimaryKey(autoGenerate = true) val id: Int=0,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "audioURL") val audioURL: String,
    @ColumnInfo(name = "localAudioPath") val localAudioPath: String,
    @ColumnInfo(name = "isDownloaded") val isDownloaded: Boolean = false,
)
