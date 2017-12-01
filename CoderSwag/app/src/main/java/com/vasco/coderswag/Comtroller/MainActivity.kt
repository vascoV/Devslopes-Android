package com.vasco.coderswag.Comtroller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.vasco.coderswag.Adapters.CategoryAdapter
import com.vasco.coderswag.R
import com.vasco.coderswag.Services.DataService
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories) // giving info to the adaptor

        categiryListView.adapter = adapter
    }
}
