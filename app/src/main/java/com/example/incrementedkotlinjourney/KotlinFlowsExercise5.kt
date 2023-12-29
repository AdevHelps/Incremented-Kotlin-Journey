package com.example.incrementedkotlinjourney

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.retryWhen
import java.io.IOException

// Write a retry logic if an exception occurred in the flow

suspend fun main() {

    flow {
        for (i in 1..3) {
            emit(i)
            delay(1000)
            if (i == 2)
                throw IOException("Connecting failed")

        }
    }
        .retryWhen { cause, attempt ->
            if (cause is IOException && attempt < 3) {
                println("An interruption happened. Trying to connect again..")
                true
            }
            else false
        }

        .collect {
            println(it)
        }

}