package com.example.pathtracker.db

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.room.TypeConverter
import java.io.ByteArrayOutputStream

class Converter {

    @TypeConverter
    fun toBitmap(byteArray: ByteArray) : Bitmap{
        return BitmapFactory.decodeByteArray(byteArray , 0 , byteArray.size)
    }

    @TypeConverter
    fun fromBitmap(bmp : Bitmap) : ByteArray{
        val outputStream = ByteArrayOutputStream()
        bmp.compress(Bitmap.CompressFormat.PNG , 100 , outputStream)
        return outputStream.toByteArray()
    }
}