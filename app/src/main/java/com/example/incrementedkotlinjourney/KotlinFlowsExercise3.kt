package com.example.incrementedkotlinjourney

import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.buffer
import kotlinx.coroutines.flow.flow

// Create a Flow that emits strings. Use the buffer operator with a custom lambda function to buffer
// items until the total length of the buffered strings is greater than 10.

suspend fun main() {

    flow {
        for (i in 1..100) {
            delay(2000)
            emit(i)
        }
    }
        .buffer()
        .collect {
            delay(2000)
            println(it)
        }
}