package com.vasco.coderswag.Comtroller

import android.content.res.Configuration
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import com.vasco.coderswag.Adapters.ProductsAdapter
import com.vasco.coderswag.R
import com.vasco.coderswag.Services.DataService
import com.vasco.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_product.*

class ProductActivity : AppCompatActivity() {

    lateinit var adapter : ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_product)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this, DataService.getProducts(categoryType))
        productListView.adapter = adapter

        var spanCount = 2

        val orientation = resources.configuration.orientation //return the index of the screen orientation
        if (orientation == Configuration.ORIENTATION_LANDSCAPE) spanCount = 3

        val screenSize = resources.configuration.screenWidthDp //getting the current device screen width
        if (screenSize > 720) spanCount = 3


        val layoutManager = GridLayoutManager(this, spanCount) //spancount are the columns
        productListView.layoutManager = layoutManager
    }
}
