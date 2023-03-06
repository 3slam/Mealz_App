package com.example.data.repo

import com.example.data.remote.ApiService
import com.example.domain.model.CategoryResponse
import com.example.domain.repo.MealsRepo

class MealsRepoImp (private val apiService: ApiService):MealsRepo {
    override suspend fun getMealsFromRemote(): CategoryResponse = apiService.getMeals()
}