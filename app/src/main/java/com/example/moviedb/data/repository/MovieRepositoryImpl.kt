package com.example.moviedb.data.repository

import com.example.moviedb.data.api.MovieApi
import com.example.moviedb.model.Movie
import retrofit2.Response
import javax.inject.Inject


class MovieRepositoryImpl @Inject constructor(
    private val service: MovieApi
) : MovieRepository {

    override suspend fun getMoviesList(): Response<List<Movie>> {
        TODO("Not yet implemented")
    }

    override suspend fun getMoviesList(query: String): Response<List<Movie>> {
        TODO("Not yet implemented")
    }
}