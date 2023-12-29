package com.example.incrementedkotlinjourney

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.flowOn

// Create a list of lower case characters and convert them to uppercase on a different thread

suspend fun main() {

    flowOf('z', 'f', 'r', 'g', 'h', 'w')
        .flowOn(Dispatchers.Default)

        .collect { char ->
            delay(1000)
            print("(${Thread.currentThread().name}): ")
            println(char.uppercase())

        }
}
