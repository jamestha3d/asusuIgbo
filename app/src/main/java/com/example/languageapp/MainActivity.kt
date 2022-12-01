package com.example.languageapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.languageapp.ui.theme.LanguageAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LanguageAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    LanguageAppTheme {
        Greeting("Android")
    }
}

/*
 -
 database: LangaugeAppDatabase
 LessonEntity (table in DB)
 id
 question
 question_type (SingleSelect)
 correct_answer

(this has a foreign key)
 OptionsEntity
 lesson_id (LessonEntity.id)
 option_text
 audio_url
 additional_info

 UserInfoEntity
 username
 password
 full_name
 current_language
 date_started
 bio


 // DAO - data access object


 Lesson 1
 Q1, Q2, Q3..

 Question queried from fireBase
 --> clear data in local DB
 --> stored in local DB
 --> get id of all quests stored frm DB
 --> as user finshes one question to the next, query DB for next question via ID.

ImgChoiceFragment.kt
SentenceBuilderFragment.kt
SingleSelectFragment.kt
WordPairFragment.kt
WrittenTextFragment.kt
 */


















