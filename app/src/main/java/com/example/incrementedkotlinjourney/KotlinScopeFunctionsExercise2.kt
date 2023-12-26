package com.example.incrementedkotlinjourney

// Create a chain of nullable properties or functions and use a scope function to safely navigate
// through them without causing null pointer exceptions.

private var indexNumber: Int? = null
private var indexData: String? = null
private fun nullableFunction(): Double? = null

fun main() {

    indexNumber?.let {
        println("indexNumber is not null")
    }

    indexData?.let {
        println("indexData has a value")
    }

    nullableFunction()?.let {
        println("This function works just fine")
    }

}