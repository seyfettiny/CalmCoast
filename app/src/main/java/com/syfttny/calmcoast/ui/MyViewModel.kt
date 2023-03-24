package com.syfttny.calmcoast.ui

import androidx.lifecycle.ViewModel
import com.syfttny.calmcoast.repository.MeditationRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
    private val repository: MeditationRepository
) : ViewModel(){
}