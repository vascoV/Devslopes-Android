package com.learn.kotlin.learnkotlin

fun main(args: Array<String>) {

    //how to show NPE is possible
    //make an explicit call to throw NPE
    //extra no java code

    var name: String = "JohnyB"
//    name = null

    var nullableName: String? = "Do I really exits?"

    //1) Null check
    val l = if(nullableName != null) nullableName.length else -1
    println(l)

    //2) Safe call Operator
    println(nullableName?.length)

    //3) Elvis Operator (?:)
    val len = nullableName?.length ?: -1 //if there is non-null value will assign the len to the length of the variabla else wil ptinr -1

    //4) !!
    println(nullableName!!.length) //only use this that the value for that variable will be there

}