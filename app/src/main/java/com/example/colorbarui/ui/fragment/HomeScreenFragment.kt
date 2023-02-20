package com.example.colorbarui.ui.fragment

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import com.example.colorbarui.databinding.FragmentHomeScreenBinding
import com.example.colorbarui.ui.adapter.CategoriesAdapter
import com.example.colorbarui.ui.adapter.ShopCategoriesAdapter
import com.example.colorbarui.ui.adapter.TopProductsAdapter

import com.example.colorbarui.ui.viewModel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeScreenFragment : BaseFragment<FragmentHomeScreenBinding>() {
    override val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> FragmentHomeScreenBinding
            = FragmentHomeScreenBinding::inflate

    //setUp ViewModel using viewModels
    private val homeViewModel by viewModels<HomeViewModel>()

    override fun setup() {

//        homeViewModel.getCategory()
        /* We call the getCategory() present inside the viewModel from onViewCreated() method   */


//        homeViewModel.categoryLiveData.observe(viewLifecycleOwner, Observer {
//
//        })
        /*
        We will put observer to observe the data changes inside the categoryLiveData.
        When ever there is change in data e.g. When API is successfully executed then categoryLiveData returns will notify and return the data
        Later we will pass the data inside the recycler view adapter.
         */

        //setUp RecyclerViews and pass the list inside the constructor of adapter class
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