package com.example.languageapp.data.local

import androidx.room.Dao
import androidx.room.Query
import com.example.languageapp.data.local.entities.LessonEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface LanguageAppDao {
    @Query("SELECT * FROM lesson")
    fun getAllQuestionFromLesson(): Flow<LessonEntity>
    // suspend, single values. flow, multiple values over time or lists.
}