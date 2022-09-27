package com.example.tuesdayproject.network

import com.example.tuesdayproject.model.Post
import retrofit2.http.GET

interface ApiService {
    @GET("posts")
    suspend fun getPost(): List<Post>
}