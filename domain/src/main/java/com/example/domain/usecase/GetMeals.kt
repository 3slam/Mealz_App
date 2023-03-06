package com.example.domain.usecase

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.domain.repo.MealsRepo
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class GetMeals (private val mealsRepo: MealsRepo) {
    suspend operator fun invoke ()= mealsRepo.getMealsFromRemote()
}


