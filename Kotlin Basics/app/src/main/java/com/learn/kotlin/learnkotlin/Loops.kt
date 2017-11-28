package com.learn.kotlin.learnkotlin

fun main(args: Array<String>) {

    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma") //mutalbe list


    val rebelVehicle = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Land Spear", "Bobba Fet" to "Rokka") //mutable map type

    for (rebel in rebels) { //iteration into an array

        println("Name: $rebel")
    }

    for ((key, value) in rebelVehicle) { //iterate through an hashmap

        println("$key gets around in there $value")
    }


    //while loop

    var x = 10

    while (x > 0) {

        println(x)
        x--
    }

}