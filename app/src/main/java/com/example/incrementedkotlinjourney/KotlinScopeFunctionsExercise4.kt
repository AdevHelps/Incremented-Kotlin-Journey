package com.example.incrementedkotlinjourney

// Define a nullable variable of a custom data type.
// Use a scope function to perform operations only if the variable is not null.

var bookName: String? = null

fun main() {

    bookName = "Amazing book"

    bookName?.let {
        println("This book has a name")

    }
}