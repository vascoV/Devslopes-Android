package com.vasco.coderswag.Model


class Category (val title: String, val image: String) {

    override fun toString(): String {  //returning as defoult the title instead the memory addres pf the item
        return title
    }
}