package com.example.incrementedkotlinjourney

// Create a data class representing a person with properties such as name, age, and address.
// Use a scope function to initialize an instance of the person with some sample data

data class Person(
    var name : String = "No name",
    var age: Int = 0,
    var address: String = "No address"
)

fun main() {

    val person = Person().run {
        name = "Mark"
        age = 53
        address = "Milton, Florida"
        this
    }

    println(person)
}