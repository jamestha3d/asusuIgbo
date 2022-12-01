package com.example.languageapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.languageapp.data.local.entities.LessonEntity

@Database(
    entities = [LessonEntity::class, ],
    version = 1,
    exportSchema = false
)
abstract class LanguageAppDatabase : RoomDatabase(){
    abstract val dao: LanguageAppDao

    companion object {
        const val DATABASE_NAME = "language_app_db"
    }
}