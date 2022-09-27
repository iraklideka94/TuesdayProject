package com.example.tuesdayproject.repository

import com.example.tuesdayproject.model.Post
import com.example.tuesdayproject.network.ApiServiceImpl
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class MainRepository @Inject constructor(private val apiServiceImpl: ApiServiceImpl) {
      fun getPost(): Flow<List<Post>> = flow{
          emit(apiServiceImpl.getPost())
      }.flowOn(Dispatchers.IO)
}