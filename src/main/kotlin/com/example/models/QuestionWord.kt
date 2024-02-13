package com.example.models

import kotlinx.serialization.Serializable

@Serializable
data class QuestionWord(
    val idOfWord: Int,
    val turkishWord: String,
    val englishWord: String,
    val scoreOfWord: Int
)
