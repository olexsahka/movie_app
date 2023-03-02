package com.example.moviedb.data.api

import com.example.moviedb.model.Movie
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface MovieApi {
    @GET(" ")
    suspend fun getMovies(

    ): Response<Movie>
}