package com.example.daggerdemo.ui.main

import com.example.daggerdemo.base.BaseViewModel
import com.example.daggerdemo.data.rest.PostApi
import javax.inject.Inject

class PostListViewModel: BaseViewModel() {
    @Inject
    lateinit var postApi: PostApi
}