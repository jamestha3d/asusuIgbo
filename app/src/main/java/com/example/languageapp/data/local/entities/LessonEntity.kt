package com.example.languageapp.data.local.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "lesson"
)
data class LessonEntity(
    @PrimaryKey
    @ColumnInfo(name = "id") val id: Long? = null,
    @ColumnInfo(name = "question") val question: String? = null,
    @ColumnInfo(name = "question_type") val questionType: String,
    @ColumnInfo(name = "correct_answer") val correctAnswer: String
)