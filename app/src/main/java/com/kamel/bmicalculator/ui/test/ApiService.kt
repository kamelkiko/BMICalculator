package com.kamel.bmicalculator.ui.test

import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {
    @GET("users")
    suspend fun getAllUsers(): List<UserDto>

    @POST("users")
    suspend fun addUser(@Body userDto: UserDto):UserDto
}