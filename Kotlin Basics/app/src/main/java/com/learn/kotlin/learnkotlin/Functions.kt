package com.learn.kotlin.learnkotlin



fun main(args: Array<String>){

    fun forceChoke() {

        println("You have failed me for the last time Admiral!")

    }
    forceChoke() //calling the function

    fun makeAnEntrance(line: String) { //passing argument to a function

        println(line)

    }

    makeAnEntrance("I find you lack of faith disturbing")

    fun calcukateNumGoddGuys(rebels: Int, ewoks: Int): Int {  //function of type Int rturn value

        val goodGuys = rebels + ewoks

        return  goodGuys
    }

    val rebels = calcukateNumGoddGuys(20, 12)

    println("He faiced off against $rebels") //OR
    println("He faiced off against ${calcukateNumGoddGuys(7, 8)} rebel scum")

    fun vaderFeeling(mood: String = "angry") { //function with default value
        print(mood)
    }

    vaderFeeling() //function call



}