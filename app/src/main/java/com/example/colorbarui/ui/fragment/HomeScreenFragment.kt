package com.example.colorbarui.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.colorbarui.databinding.FragmentHomeScreenBinding
import com.example.colorbarui.ui.adapter.CategoriesAdapter
import com.example.colorbarui.ui.adapter.ShopCategoriesAdapter
import com.example.colorbarui.ui.adapter.TopProductsAdapter

import com.example.colorbarui.ui.viewModel.HomeViewModel


class HomeScreenFragment : BaseFragment<FragmentHomeScreenBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHomeScreenBinding
            = FragmentHomeScreenBinding::inflate

    //setUp ViewModel
    private val homeViewModel by viewModels<HomeViewModel>()

    override fun setup() {

        //setUp RecyclerViews
        binding?.rvFreshArrivalsProducts?.apply {
            adapter= ShopCategoriesAdapter(homeViewModel.categoryList)
        }
        binding?.rvBestSellerProducts?.apply {
            adapter= ShopCategoriesAdapter(homeViewModel.categoryList)
        }
        binding?.rvCategoryProducts?.apply {
            adapter= CategoriesAdapter(homeViewModel.categoriesItemsList,requireActivity())
        }
        binding?.rvTopProducts?.apply {
            adapter= TopProductsAdapter(homeViewModel.topItemsList)
        }
    }


}