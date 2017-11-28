package com.learn.kotlin.learnkotlin


fun main(args: Array<String>) {

    val a = 2
    val b = 3

    if (a == b) {

        println("$a = $b")

    }

    if (a != b) {

        println("$a is not equals to $b")
    }

    val accountBalance = 100
    val price = 50

    if (accountBalance >= price) {

        println("You can buy this!")
    } else {
        println("Sorry mate you are broke!")
    }

    val degree = 70

    //conditional operators
    if (degree >= 70) {

        println("This is hot")
    } else if (degree < 70 && degree >= 50) {

        print("Grab a sweater")
    } else {

        println("Holy crap its cold!")
    }

    //conditional logic with bool values
    val isHungry = false
    val isBored = true

    if (isHungry || isBored) {
        println("Let's get pizza!")
    }

    //when statement (switch)
    val x = 1

    when (x) {

        1 -> println("X is equal to 1")

        2 -> println("Z is equal to 2")

        else -> println("X does not equal to 1 or 2")
    }

    fun vaderIsFeeling(mood: String = "angry") {

        if (mood == "angry") {
            println("Run away ir you will die $mood")
        } else {
            println("whatever you do don't make hin angry pls!")
        }

    }
}
