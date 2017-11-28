package com.learn.kotlin.learnkotlin


fun main(args: Array<String>) {

    val imperials = listOf("Emperor", "Darth Vader", "Boba Fett", "Tarkin") //inmutable list array

    println(imperials.sorted()) //you can sort lists
    println(imperials[1]) //access specific element from your array
    println(imperials.first()) //give you the first element
    println(imperials.contains("Emperror")) //contain a specific string

    val rebels = arrayListOf("Leiah", "Luke", "Han Solo", "Mon Mothma") //mutalbe list

    println(rebels.size) //gives the size

    rebels.add("Chewbaca") //add an element its beed added at the end of the array
    rebels.add(0, "Laddo") //add element at a specific place into the array

    println(rebels.indexOf("Like")) //return the index of the given element

    rebels.remove("Han Solo") //remove by the element of its self

    //Let's talk about maps(key, value)
    val vehicleRebelMap = mapOf("Solo" to "Millenium Falcon", "Luke" to "Land Spear")
    println(vehicleRebelMap["Solo"])
    println(vehicleRebelMap.get("Solo"))
    println(vehicleRebelMap.getOrDefault("Leiah", "The ship doesn't exists")) // if leiah key is not found the default value will be printed
    println(vehicleRebelMap.values) //print the map values

    val rebelVehicle = hashMapOf("Solo" to "Millenium Falcon", "Luke" to "Land Spear", "Bobba Fet" to "Rokka") //mutable map type

    rebelVehicle["Luke"] = "Xwing" //change the value of a given key
    rebelVehicle.put("Leiha", "Tantive IV")
    println(rebelVehicle)
    rebelVehicle.remove("Bobba Fet") //removing element with specific element
    rebelVehicle.isEmpty() //return true or false if hashmap is full or empty





}
