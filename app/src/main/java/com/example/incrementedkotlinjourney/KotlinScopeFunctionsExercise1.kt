package com.example.incrementedkotlinjourney

// Create a class representing a car with properties like model, color, and year.
// Use a scope function to perform different actions on the car based on its properties.

class Car {
    var model = "Car Model"
    var color = "Black"
    var year = 2016
}

fun main() {

    Car().apply {
        model = "New Car Model"
        color = "White"
        year = 2009
    }
}