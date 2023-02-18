package com.example.colorbarui.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding


abstract class BaseFragment<T: ViewBinding>  : Fragment() {
    protected var binding: T? = null
//Base Fragment to handle ViewBinding and inflation

    abstract val bindingInflater: (LayoutInflater, ViewGroup?, Boolean) -> T




    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = bindingInflater.invoke(inflater, container, false)

        return binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setup()
    }

    // implement setup function to access views
    abstract fun setup()

    // destroy viewBinding in onDestroy method
    override fun onDestroyView() {
        super.onDestroyView()

        binding = null
    }





}