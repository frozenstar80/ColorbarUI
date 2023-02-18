package com.example.colorbarui.ui.viewModel

import androidx.lifecycle.ViewModel
import com.example.colorbarui.R
import com.example.colorbarui.model.CategoryList
import com.example.colorbarui.utils.Contants

class HomeViewModel : ViewModel() {

    // list of categories items
    val categoryList : MutableList<CategoryList> = arrayListOf()
    val categoriesItemsList : MutableList<CategoryList> = arrayListOf()
    val topItemsList : MutableList<CategoryList> = arrayListOf()

    init {
        // temp data is data to show in UI
        categoryList.add(CategoryList( R.drawable.eyes_makeup_1, Contants.CATEGORY_DESC))
        categoryList.add(CategoryList(R.drawable.eyes_makeup_2, Contants.CATEGORY_DESC))
        categoryList.add(CategoryList(R.drawable.eyes_makeup_3, Contants.CATEGORY_DESC))
        categoryList.add(CategoryList(R.drawable.eyes_makeup_4, Contants.CATEGORY_DESC))
        categoryList.add(CategoryList(R.drawable.eyes_makeup_5, Contants.CATEGORY_DESC))
        categoryList.add(CategoryList(R.drawable.eyes_makeup_6, Contants.CATEGORY_DESC))


        //categories shop list
        categoriesItemsList.add(CategoryList( R.drawable.product_eyes, Contants.EYES))
        categoriesItemsList.add(CategoryList(R.drawable.product_face, Contants.FACE))
        categoriesItemsList.add(CategoryList(R.drawable.product_skin, Contants.SKIN))
        categoriesItemsList.add(CategoryList(R.drawable.product_nails, Contants.NAILS))
        categoriesItemsList.add(CategoryList(R.drawable.product_accessories, Contants.ACCESS))

        //top items list
        topItemsList.add(CategoryList( R.drawable.product_nails, Contants.NAILS))
        topItemsList.add(CategoryList(R.drawable.product_face, Contants.FACE))
        topItemsList.add(CategoryList(R.drawable.eyes_makeup_1, Contants.EYES))
        topItemsList.add(CategoryList(R.drawable.product_eyes, Contants.EYES))
        topItemsList.add(CategoryList(R.drawable.product_accessories, Contants.ACCESS))


    }
}