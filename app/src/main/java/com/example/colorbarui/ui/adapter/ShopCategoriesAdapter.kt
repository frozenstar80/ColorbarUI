package com.example.colorbarui.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.colorbarui.databinding.LytProductCvBinding
import com.example.colorbarui.model.CategoryList
import java.util.*

class ShopCategoriesAdapter(private val list: List<CategoryList>) :
    RecyclerView.Adapter<ShopCategoriesAdapter.GuruSevaViewHolder>() {

    class GuruSevaViewHolder(val binding: LytProductCvBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuruSevaViewHolder {
        return GuruSevaViewHolder(
            LytProductCvBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    @SuppressLint("SimpleDateFormat")
    override fun onBindViewHolder(holder: GuruSevaViewHolder, position: Int) {
        with(holder) {
            binding.imgCategory.setImageResource(list[position].image)
        }
    }


    override fun getItemCount(): Int {
        return list.size

    }
}

