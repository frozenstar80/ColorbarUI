package com.example.colorbarui.ui.adapter

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.colorbarui.databinding.LytTopProductsBinding
import com.example.colorbarui.model.CategoryList
import java.util.*

class TopProductsAdapter(private val list: List<CategoryList>) :
    RecyclerView.Adapter<TopProductsAdapter.GuruSevaViewHolder>() {

    class GuruSevaViewHolder(val binding: LytTopProductsBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuruSevaViewHolder {
        return GuruSevaViewHolder(
            LytTopProductsBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    @SuppressLint("SimpleDateFormat")
    override fun onBindViewHolder(holder: GuruSevaViewHolder, position: Int) {
        with(holder) {
            binding.imgProduct.setImageResource(list[position].image)
            binding.txtName.text = list[position].text
        }
    }


    override fun getItemCount(): Int {
        return list.size

    }
}

