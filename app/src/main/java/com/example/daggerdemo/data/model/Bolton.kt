package com.example.daggerdemo.data.model

import javax.inject.Inject

class Bolton: House {

    @Inject
    fun Bolton(){

    }

    override fun prepareForWar() {
        System.out.println(this.javaClass.getSimpleName()+" prepared for war")
    }

    override fun reportForWar() {
        System.out.println(this.javaClass.getSimpleName()+" reporting..")
    }
}