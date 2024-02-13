package com.example.models

import kotlinx.serialization.Serializable


@Serializable
data class ApiResponse(
    val questionWordList: MutableList<QuestionWord>
)