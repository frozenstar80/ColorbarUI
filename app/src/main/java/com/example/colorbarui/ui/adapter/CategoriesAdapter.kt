package com.example.colorbarui.ui.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.colorbarui.R
import com.example.colorbarui.databinding.LytCatogoryBinding
import com.example.colorbarui.model.CategoryList
import java.util.*

class CategoriesAdapter(private val list: List<CategoryList>, private val activity: Activity) :
    RecyclerView.Adapter<CategoriesAdapter.GuruSevaViewHolder>() {

    class GuruSevaViewHolder(val binding: LytCatogoryBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GuruSevaViewHolder {
        return GuruSevaViewHolder(
            LytCatogoryBinding.inflate(
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
            binding.txtDesc.text = list[position].text
            binding.root.setOnClickListener {
                Navigation.findNavController(activity, R.id.nav_host_fragment)
                    .navigate(R.id.action_homeScreenFragment_to_categoryFragment)
            }
        }
    }


    override fun getItemCount(): Int {
        return list.size

    }
}

