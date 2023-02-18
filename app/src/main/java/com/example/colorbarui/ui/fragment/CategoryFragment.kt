package com.example.colorbarui.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.colorbarui.databinding.FragmentCategoryBinding
import com.example.colorbarui.ui.adapter.ShopCategoriesAdapter
import com.example.colorbarui.ui.viewModel.CategoryViewModel


class CategoryFragment : BaseFragment<FragmentCategoryBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentCategoryBinding
            = FragmentCategoryBinding::inflate

    private val categoryViewModel by viewModels<CategoryViewModel>()

    override fun setup() {
        binding?.rvCategory?.apply {
            adapter=ShopCategoriesAdapter(categoryViewModel.categoryList)
        }

    }


}