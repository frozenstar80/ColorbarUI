package com.example.colorbarui.ui.viewModel

import androidx.lifecycle.ViewModel
import com.example.colorbarui.R
import com.example.colorbarui.model.CategoryList
import com.example.colorbarui.utils.Contants

class CategoryViewModel : ViewModel() {

    // list of categories items
    val categoryList : MutableList<CategoryList> = arrayListOf()

    init {

        // temp data is data to show in UI
        categoryList.add(CategoryList( R.drawable.eyes_makeup_1,Contants.CATEGORY_DESC))
        categoryList.add(CategoryList(R.drawable.eyes_makeup_2,Contants.CATEGORY_DESC))
        categoryList.add(CategoryList(R.drawable.eyes_makeup_3,Contants.CATEGORY_DESC))
        categoryList.add(CategoryList(R.drawable.eyes_makeup_4,Contants.CATEGORY_DESC))
        categoryList.add(CategoryList(R.drawable.eyes_makeup_5,Contants.CATEGORY_DESC))
        categoryList.add(CategoryList(R.drawable.eyes_makeup_6,Contants.CATEGORY_DESC))
    }
}