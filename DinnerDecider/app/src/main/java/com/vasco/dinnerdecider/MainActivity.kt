package com.vasco.dinnerdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val foodList = arrayListOf("Chines", "Pizza", "Mexican", "Chicken", "Crepes", "Steak")

        decideBtn.setOnClickListener{

            val random = Random()
            val randomFood = random.nextInt(foodList.count())

            selectedFoodTxt.text = foodList[randomFood] //set the random food to the text view

        }

        addFoodBtn.setOnClickListener{
            val newFood = addFoodTxt.text.toString()
            foodList.add(newFood) //add food to the array
            addFoodTxt.text.clear() //clear the text view
        }

    }
}
