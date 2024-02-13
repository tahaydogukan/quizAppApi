package com.example.routes

import com.example.repository.HeroRepository
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject

fun Route.getAllHeroes(){

    val heroRepository: HeroRepository by inject()

    get("/question"){

            val page = call.request.queryParameters["page"]?.toInt() ?: 1
            require(page in 1..5)

            val apiResponse = heroRepository.getQuestion()

           call.respond(
                message = apiResponse,
                status = HttpStatusCode.OK
            )

    }
    get("/question2"){

        val apiResponse = heroRepository.getQuestionMedium()

        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )

    }
    get("/question3"){


        val apiResponse = heroRepository.getQuestionHard()

        call.respond(
            message = apiResponse,
            status = HttpStatusCode.OK
        )

    }
    
}