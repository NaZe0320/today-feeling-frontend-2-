package com.naze.todayfeeling.di

import com.naze.todayfeeling.data.service.RecordService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object ServiceModule {
    @Singleton
    @Provides
    fun provideRecordService() : RecordService {
        return Retrofit.Builder()
            .baseUrl("https://api.jaegoblock.com/")
            .build()
            .create(RecordService::class.java)
    }
}