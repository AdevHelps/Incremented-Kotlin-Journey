package com.example.incrementedkotlinjourney

import kotlinx.coroutines.flow.flowOf
import kotlinx.coroutines.flow.transform

// Extend the previous flow by applying a transformation that squares each emitted number.
// Print the squared values in the main function.

suspend fun main() {


    flowOf(2, 3, 4, 5, 6, 7)
        .transform {
            emit(it * it)

        }
        .collect{ println(it) }

}