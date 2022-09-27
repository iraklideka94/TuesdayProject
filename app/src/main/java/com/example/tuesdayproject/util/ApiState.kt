package com.example.tuesdayproject.util

import com.example.tuesdayproject.model.Post

sealed class ApiState{
    object Loading : ApiState()
    class Failure(val msg: Throwable): ApiState()
    class Success(val data: List<Post>): ApiState()
    object Empty: ApiState()
}
