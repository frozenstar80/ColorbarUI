package com.example.colorbarui.di


import com.example.colorbarui.api.ApiService
import com.example.colorbarui.utils.Contants
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class AppModule {

    @Provides
    @Singleton
    fun retrofitInstance():Retrofit = Retrofit.Builder()
        .baseUrl(Contants.BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    //created retrofit class instance and passed the BASE URl and the converter factory to convert the data from json format to GSON



    @Provides
    @Singleton
    fun getApiService(retrofit: Retrofit): ApiService =
        retrofit.create(ApiService::class.java)
}