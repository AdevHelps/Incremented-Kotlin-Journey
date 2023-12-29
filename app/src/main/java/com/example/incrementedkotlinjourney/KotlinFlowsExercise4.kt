package com.example.incrementedkotlinjourney

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart

// Create a flow that emits numbers from 1 to 3. Use onStart to print a message when the flow starts
// and onCompletion to print a message when it completes.

suspend fun main() {

    (1..7).asFlow()
        .onStart {
            println("The flow started")
        }
        .onCompletion {
            println("The flow completed")
        }
        .buffer()
        .collect{
            delay(1000)
            println(it)
        }

}