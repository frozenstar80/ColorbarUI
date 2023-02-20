package com.example.colorbarui.ui.viewModel

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.colorbarui.R
import com.example.colorbarui.model.CategoryList
import com.example.colorbarui.repository.CategoryRepository
import com.example.colorbarui.utils.Contants
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val categoryRepository: CategoryRepository) : ViewModel() {


    private val _categoryLiveData: MutableLiveData<CategoryList> = MutableLiveData()
    val categoryLiveData get() = _categoryLiveData

    fun getCategory(){
        viewModelScope.launch {
            categoryRepository.getCategories().catch { e->
                Log.d("main", "getPost: ${e.message}")
            }.collect{response->
                _categoryLiveData.value = response
            }
        }
    }

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