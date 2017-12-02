package com.vasco.coderswag.Services

import com.vasco.coderswag.Model.Category
import com.vasco.coderswag.Model.Product

//Singleton patern
object DataService {

    val categories = listOf(
            Category("SHIRTS", "shirtimage"),
            Category("HOODIES", "hoodieimage"),
            Category("HATS", "hatimage"),
            Category("DIGITAL", "digitalgoodsimage")
    )

    val hats = listOf(
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Graphic Black", "$20", "hat2"),
            Product("Devslopes Graphic White", "$18", "hat3"),
            Product("Devslopes Graphic Snapback", "$22", "hat4"),
            Product("Devslopes Graphic Beanie", "$18", "hat1"),
            Product("Devslopes Graphic Black", "$20", "hat2"),
            Product("Devslopes Graphic White", "$18", "hat3"),
            Product("Devslopes Graphic Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
            Product("Devslopes Hoodie Gray", "$28", "hoodie1"),
            Product("Devslopes Hoodie Red", "$32", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$28", "hoodie3"),
            Product("Devslopes Black Hoodie", "$32", "hoodie4"),
            Product("Devslopes Hoodie Red", "$32", "hoodie2"),
            Product("Devslopes Gray Hoodie", "$28", "hoodie3")
    )

    val shirts = listOf(
            Product("Devslopes shirt Black", "$18", "shirt1"),
            Product("Devslopes Badge Light Gray", "$20", "shirt2"),
            Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
            Product("Devslopes Hustle", "$22", "shirt4"),
            Product("Devslopes Studios", "$18", "shirt5"),
            Product("Devslopes shirt Black", "$18", "shirt1"),
            Product("Devslopes Badge Light Gray", "$20", "shirt2"),
            Product("Devslopes Logo Shirt Red", "$22", "shirt3"),
            Product("Devslopes Hustle", "$22", "shirt4"),
            Product("Devslopes Studios", "$18", "shirt5")
    )

    val digitlaGoods = listOf<Product>()

    fun getProducts(category: String): List<Product> {

        return when (category) { //similar top switch in other languages
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitlaGoods
        }
    }
}