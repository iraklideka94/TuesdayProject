package com.example.tuesdayproject.network

import com.example.tuesdayproject.model.Post
import javax.inject.Inject

class ApiServiceImpl @Inject constructor(private val apiService: ApiService) {

    suspend fun getPost(): List<Post> = apiService.getPost()

}