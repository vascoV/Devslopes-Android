package com.learn.kotlin.learnkotlin

fun main(args: Array<String>) {

    //escaped strings using any escape character like \n, \r, \, etc etc....

    val str = "May the force be with you"

    println(str)

    //raw strings\


    val rawCrawl = """|A long time ago,
        |in a galaxy,
        |far, far ,far away...,
        |BUM, BUM, BUMMMM... """".trimMargin() //default trim char is '|'

    println(rawCrawl)

    for (char in str){ //loop through chars in a string
        println(char)
    }

    //useful methods
    str.contentEquals("May the force be with you") //return true or false when comparing strings in this scenario we are comparing str string with the one in the '()'

    str.contains("farse", true) //true stands to ignore cases this method checks for existing sting into an existing string variable

    str.toUpperCase() //set the string to all upper case
    str.toLowerCase() //set the string to all lower string

    val num = 6
    val stringNum = num.toString() //prints 6 as a character

    str.subSequence(4, 14) //print out only from 4th to 14th character


    //string templates
    val name = "Vasco"
    val age = 23
    val job = "Mobile developer"

    println("$name is $age years old and works as $job") //string template to print out a number of string with out using many quotes

    

}