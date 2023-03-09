package com.syfttny.calmcoast.model

import android.graphics.Bitmap
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "meditations")
data class Meditation(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @ColumnInfo(name = "duration") val duration: Int,
    @ColumnInfo(name = "title") val title: String,
    @ColumnInfo(name = "audioURL") val audioURL: String,
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "localAudioPath") val localAudioPath: String,
    @ColumnInfo(name = "isDownloaded") val isDownloaded: Boolean = false,
    @ColumnInfo(name = "image") val image: Bitmap,
)
