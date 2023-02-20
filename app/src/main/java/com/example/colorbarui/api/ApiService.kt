package com.example.colorbarui.api

import com.example.colorbarui.model.CategoryList
import retrofit2.http.GET

interface ApiService {

    // interface class to call the categories end point and then pass data to data class and return it
    @GET("/top-categories")
    suspend fun getCategory():CategoryList
}