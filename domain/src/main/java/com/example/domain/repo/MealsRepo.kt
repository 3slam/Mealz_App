package com.example.domain.repo

import com.example.domain.model.CategoryResponse

interface MealsRepo {
    suspend fun getMealsFromRemote():CategoryResponse
}