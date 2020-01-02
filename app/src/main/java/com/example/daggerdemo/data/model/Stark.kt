package com.example.daggerdemo.data.model

import javax.inject.Inject

class Stark: House {

    @Inject //Dagger 2
    fun Starks() {
    }

    override fun prepareForWar() {
        System.out.println(this.javaClass.getSimpleName()+" prepared for war")
    }

    override fun reportForWar() {
        System.out.println(this.javaClass.getSimpleName()+" reporting..")
    }


}