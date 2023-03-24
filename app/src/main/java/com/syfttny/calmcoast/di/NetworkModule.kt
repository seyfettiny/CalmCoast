package com.syfttny.calmcoast.di

import android.app.Application
import android.content.Context
import android.net.ConnectivityManager
import com.syfttny.calmcoast.database.AppDatabase
import com.syfttny.calmcoast.repository.MeditationRepository
import com.syfttny.calmcoast.repository.RetrofitService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Provides
    fun provideBaseUrl() = "calmcoast"

    @Provides
    @Singleton
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder()
            .build()
    }

    @Provides
    @Singleton
    fun provideConnectivityManager(application: Application): ConnectivityManager {
        return application.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    }

    @Provides
    @Singleton
    fun provideRetrofitService(okHttpClient: OkHttpClient, baseUrl: String): RetrofitService {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .client(okHttpClient)
            .build()
            .create(RetrofitService::class.java)
    }

    @Provides
    @Singleton
    fun provideMeditationRepository(appDatabase: AppDatabase,retrofitService: RetrofitService):MeditationRepository{
        return MeditationRepository(appDatabase,retrofitService)
    }
}