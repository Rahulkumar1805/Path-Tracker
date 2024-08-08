package com.example.pathtracker.db

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "running_table")
data class Run(
    var img : Bitmap?= null,
    var timestamp: Long = 0L,
    var avgSpeedInKM : Float = 0f,
    var distanceINMeters : Int = 0,
    var timeInMillis : Long = 0L,
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int?=null

}