package com.vasco.coderswag.Adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.vasco.coderswag.Model.Category
import com.vasco.coderswag.R


class CategoryRecyclerAdapter(val ctx: Context, val categories: List<Category>, val itemClick: (Category) -> Unit) : RecyclerView.Adapter<CategoryRecyclerAdapter.Holder>() {

    override fun onBindViewHolder(holder: Holder?, position: Int) { //this is the function which is called by the recycler to specify the location item

        holder?.bindCategory(categories[position], ctx)
    }

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): Holder {  //called when new view holder is needed

        val view = LayoutInflater.from(parent?.context)
                .inflate(R.layout.category_list_item, parent, false)

        return Holder(view, itemClick)
    }

    override fun getItemCount(): Int { //how many items is going to be despyed
        return categories.count()
    }


    inner class Holder(itemView: View?, val itemClick: (Category) -> Unit) : RecyclerView.ViewHolder(itemView) {

        val categoryImage = itemView?.findViewById<ImageView>(R.id.categoryImage)
        val categoryName = itemView?.findViewById<TextView>(R.id.categoryName)


        fun bindCategory(category: Category, ctx: Context) {

            val resourceID = ctx.resources.getIdentifier(category.image, "drawable", ctx.packageName)
            categoryImage?.setImageResource(resourceID)

            categoryName?.text = category.title

            itemView.setOnClickListener { itemClick(category) }
        }
    }
}