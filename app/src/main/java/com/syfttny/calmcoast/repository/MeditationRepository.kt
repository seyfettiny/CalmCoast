package com.syfttny.calmcoast.repository

import androidx.lifecycle.LiveData
import com.syfttny.calmcoast.database.AppDatabase
import com.syfttny.calmcoast.database.dao.MeditationDAO
import com.syfttny.calmcoast.model.Meditation
import javax.inject.Inject

class MeditationRepository @Inject constructor(
    private val database: AppDatabase,
    private val retrofitService: RetrofitService

) {


}