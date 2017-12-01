package com.vasco.coderswag.Adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.vasco.coderswag.Model.Category
import com.vasco.coderswag.R


class CategoryAdapter(ctx: Context, categories: List<Category>) : BaseAdapter() {

    val ctx = ctx
    val categories = categories

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {

        val categoryView: View

        categoryView = LayoutInflater.from(ctx).inflate(R.layout.category_list_item, null)
        val categoryImage: ImageView = categoryView.findViewById(R.id.categoryImage)
        val categoryName: TextView = categoryView.findViewById(R.id.categoryName)

        val category = categories[position] //grab each category
        val resourceID = ctx.resources.getIdentifier(category.image, "drawable", ctx.packageName) //get the image from its resource id

        categoryImage.setImageResource(resourceID)
        categoryName.text = category.title

        return categoryView
    }

    override fun getItem(position: Int): Any {
        return categories[position] //return itam at a position
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
        return categories.count() //return the number of the categories array
    }
}