package com.example.incrementedkotlinjourney

// Create a list of integers and use a combination of scope functions to perform various operations
// on the list, such as filtering, mapping, and printing the results.

fun main() {

    val integersList = listOf(1, 2, 3, 2, 5, 8)

    integersList.also {
        print("Filtered list: ")
        print("${it[0]}, ")
        print("${it[1]}, ")
        println(it[4])
    }


    val mappedList = integersList.run {
        map {it * 2}
    }

    print("Mapped list: ")
    println(mappedList)



    val listResult = with(integersList){
        this.sum()
    }

    print("List result: ")
    println(listResult)

}