package com.learn.kotlin.learnkotlin


//class Car (val make: String, val model: String, var colour: String) {
//
//    fun accelerate() {
//        println("Vroum Vroum")
//    }
//
//    fun details() {
//        println("This is a color $colour")
//    }
//}
//
//class Track(val make: String, val model: String, val towingCapacity: Int) {
//
//    fun tow() {
//        println("taking the horses to the rodeo")
//    }
//
//    fun details() {
//        println("$make $model has a capacity of $towingCapacity")
//    }
//}

//Inheritance
open class Vehicle (val make: String, val model: String) {   //by default in all classes in kotlin are final you need to declare then open in order to can inherit

    open fun accelerate () {  //allows to override the method into the child classes
        println("Vroum Vroum")
    }

    fun park() {
        println("Cars are parking")
    }

    fun brake() {
        println("STOP")
    }
}

class Car(make: String, model: String, var color: String) : Vehicle(make, model) {

    override fun accelerate() {
      print("Tesl Tesla")
    }

}


fun main(args: Array<String>) {

    val tesla = Car("Testy", "S", "red")
    tesla.accelerate()

//    val car = Car("Toyota", "Avalon", "red") //instance of a class
//
//    println(car.make + "---" + car.model)
//    car.accelerate()
//    car.details()
//
//    val track = Track("Ford", "F-50", 150)
//
//    track.tow()


}