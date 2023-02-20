package com.example.colorbarui.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.colorbarui.databinding.LytTopProductsBinding
import com.example.colorbarui.model.CategoryList
import java.util.*

class TopProductsAdapter(private val list: List<CategoryList>) : RecyclerView.Adapter<TopProductsAdapter.TopProductsViewHolder>() {

    class TopProductsViewHolder(val binding: LytTopProductsBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TopProductsViewHolder {
        return TopProductsViewHolder(
            LytTopProductsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    @SuppressLint("SimpleDateFormat")
    override fun onBindViewHolder(holder: TopProductsViewHolder, position: Int) {
        with(holder) {
            binding.imgProduct.setImageResource(list[position].image)
            binding.txtName.text = list[position].text
        }
    }


    override fun getItemCount(): Int {
        return list.size

    }
}

