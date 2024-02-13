package com.example.repository

import com.example.models.ApiResponse
import com.example.models.QuestionWord

interface HeroRepository {

    val heroes:Map<Int,List<QuestionWord>>

    val page1:List<QuestionWord>
    val page2:List<QuestionWord>
    val page3:List<QuestionWord>


    suspend fun getQuestion():ApiResponse
    suspend fun getQuestionMedium():ApiResponse
    suspend fun getQuestionHard():ApiResponse
}