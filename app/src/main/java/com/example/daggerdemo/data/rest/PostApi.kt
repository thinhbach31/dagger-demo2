package com.example.daggerdemo.data.rest

import com.example.daggerdemo.data.model.Post
import io.reactivex.Observable
import retrofit2.http.GET

interface PostApi {

    @GET("/posts")
    fun getPosts(): Observable<List<Post>>
}