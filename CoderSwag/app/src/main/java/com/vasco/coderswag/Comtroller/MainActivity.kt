package com.vasco.coderswag.Comtroller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.Toast
import com.vasco.coderswag.Adapters.CategoryAdapter
import com.vasco.coderswag.Adapters.CategoryRecyclerAdapter
import com.vasco.coderswag.R
import com.vasco.coderswag.Services.DataService
import com.vasco.coderswag.Utilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

//    lateinit var adapter : CategoryAdapter
    lateinit var adapter : CategoryRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        adapter = CategoryAdapter(this, DataService.categories) // giving info to the adaptor
        adapter = CategoryRecyclerAdapter(this, DataService.categories) { category ->

            val productIntent = Intent(this, ProductActivity::class.java)
            productIntent.putExtra(EXTRA_CATEGORY, category.title)
            startActivity(productIntent)

        } // giving info to the adaptor
        categiryListView.adapter = adapter

        val layputManager = LinearLayoutManager(this)
        categiryListView.layoutManager = layputManager
        categiryListView.setHasFixedSize(true)

//        categiryListView.setOnItemClickListener { adapterView, view, i, l ->
//            val category = DataService.categories[i]
//            Toast.makeText(this, "You clicked don ${category.title} cell", Toast.LENGTH_SHORT).show()
//        }
    }
}
