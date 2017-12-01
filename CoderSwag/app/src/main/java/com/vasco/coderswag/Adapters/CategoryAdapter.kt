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
        val holder: ViewHolder

        if (convertView == null) {
            categoryView = LayoutInflater.from(ctx).inflate(R.layout.category_list_item, null)
            holder = ViewHolder()

            holder.categoryImage = categoryView.findViewById(R.id.categoryImage)
            holder.categoryName = categoryView.findViewById(R.id.categoryName)

            categoryView.tag = holder
        } else {
            holder = convertView.tag as ViewHolder
            categoryView = convertView
        }

        val category = categories[position] //grab each category
        val resourceID = ctx.resources.getIdentifier(category.image, "drawable", ctx.packageName) //get the image from its resource id

        holder.categoryImage?.setImageResource(resourceID)
        holder.categoryName?.text = category.title

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

    private class ViewHolder {
        var categoryImage: ImageView? = null
        var categoryName: TextView? = null


    }
}