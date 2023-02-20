package com.example.colorbarui.repository


import com.example.colorbarui.api.ApiService
import com.example.colorbarui.model.CategoryList
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class CategoryRepository @Inject constructor(private val apiService: ApiService) {

    suspend fun getCategories():Flow<CategoryList> = flow {
        val response = apiService.getCategory()
        emit(response)
    }.flowOn(Dispatchers.IO)

}