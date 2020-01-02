package com.example.daggerdemo.di.component

import com.example.daggerdemo.di.module.NetWorkModule
import com.example.daggerdemo.ui.main.PostListViewModel
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [(NetWorkModule::class)])
interface ViewModelInjector {

    fun inject(postListViewModel: PostListViewModel)

    @Component.Builder
    interface Builder{
        fun build(): ViewModelInjector

        fun networkModule(netWorkModule: NetWorkModule): Builder
    }
}