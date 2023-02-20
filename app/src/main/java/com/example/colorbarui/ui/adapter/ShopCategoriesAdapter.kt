package com.example.colorbarui.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.colorbarui.databinding.LytProductCvBinding
import com.example.colorbarui.model.CategoryList
import java.util.*

class ShopCategoriesAdapter(private val list: List<CategoryList>) :
    RecyclerView.Adapter<ShopCategoriesAdapter.ShopCategoriesViewHolder>() {

    class ShopCategoriesViewHolder(val binding: LytProductCvBinding) :
        RecyclerView.ViewHolder(binding.root)

    //used for inflating the XML class to view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShopCategoriesViewHolder {
        return ShopCategoriesViewHolder(
            LytProductCvBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    // used for putting the data inside the view
    @SuppressLint("SimpleDateFormat")
    override fun onBindViewHolder(holder: ShopCategoriesViewHolder, position: Int) {
        with(holder) {
            binding.imgCategory.setImageResource(list[position].image)
        }
    }


    //return the count of items present in list
    override fun getItemCount(): Int {
        return list.size

    }
}

