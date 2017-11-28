package com.learn.kotlin.learnkotlin



fun main(args: Array<String>) {

    //Lambda mostly used for asynchronous requests

    val printMessage = { message: String -> println(message)} //lamba expression

    printMessage("Hello World")

    val sumA = { x: Int, y: Int -> println(x+y)}
    sumA(5, 40)

    val sumB: (Int, Int) -> Int = { x, y -> x + y} //thisd is the same as sumA but declaring the types befopr ethe variables
    println(sumB(34, 897))

    //Dummy download request function
    //Unit is equivalen to void in java
    fun downloadData(url: String, completion: () -> Unit) {
        //send a download request
        //we got back data
        //there were no network error
        //we are complete

        completion()

    }

    //call downloadData()
    downloadData("fakeUrl.com", {
        println("The code in this block will only run after the completion()") //here is the lanbda expression
    })

    fun downloadCarData(url: String, completion: (Car)-> Unit) {
        //send a download data
        //we got back car data

        val car = Car("Tesl", "ModelX", "RED")
        completion(car)
    }

    downloadCarData("blabla.com"){
        println(it.color + it.model)

    }

    //OR
    downloadCarData("blabla.com"){ car->
        println(car.color + car.model)

    }


    fun downloadTruckData(url: String, completion: (Car?, Boolean)-> Unit) {

        //make the web request
        //we get the results back
        val webResquestSuccess = true

        if (webResquestSuccess) {

            val car = Car("Mazda", "Demio", "Black")
            completion(car, true)
        } else {

            completion(null, false)
        }
    }

    downloadTruckData("fakeme.com"){ car, success ->   //easily manage web requests
        if (success){

            //do smth with our car
            car?.accelerate()
        } else {

            println("Something went wrong man!")
        }

    }











}