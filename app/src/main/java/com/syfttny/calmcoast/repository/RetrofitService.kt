package com.syfttny.calmcoast.repository

import com.syfttny.calmcoast.model.Meditation
import retrofit2.Response
import retrofit2.http.GET

interface RetrofitService {

    @GET("meditations")
    fun getMeditations(): Response<List<Meditation>>

    @GET("breathing_exercises")
    fun getBreathingExercises(): Response<List<Meditation>>

    @GET("sounds")
    fun getSounds(): Response<List<Meditation>>
}