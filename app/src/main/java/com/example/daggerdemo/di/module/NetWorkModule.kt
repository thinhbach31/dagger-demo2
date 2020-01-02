package com.example.daggerdemo.di.module

import com.example.daggerdemo.data.rest.PostApi
import com.example.daggerdemo.util.Util.Companion.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.Reusable
import io.reactivex.schedulers.Schedulers
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.moshi.MoshiConverterFactory

class NetWorkModule {
    @Module
    @Suppress("unused")
    object NetworkModule {
        @Provides
        @Reusable
        @JvmStatic
        internal fun providePostApi(retrofit: Retrofit): PostApi {
            return retrofit.create(PostApi::class.java)
        }

        /**
         * Provides the Retrofit object.
         * @return the Retrofit object
         */
        @Provides
        @Reusable
        @JvmStatic
        internal fun provideRetrofitInterface(): Retrofit {
            return Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .addCallAdapterFactory(RxJava2CallAdapterFactory
                    .createWithScheduler(Schedulers.io()))
                .build()
        }
    }
}