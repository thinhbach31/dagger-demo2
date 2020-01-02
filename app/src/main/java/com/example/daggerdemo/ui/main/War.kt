package com.example.daggerdemo.ui.main

import com.example.daggerdemo.data.model.Bolton
import com.example.daggerdemo.data.model.Stark
import javax.inject.Inject

class War {
    private var stark: Stark? = null
    private var bolton: Bolton? = null

    @Inject
    public fun War(stark: Stark, bolton: Bolton){
        this.stark = stark
        this.bolton = bolton
    }

    fun prepare(){
        stark?.prepareForWar()
        bolton?.prepareForWar()
    }

    fun report(){
        stark?.reportForWar()
        bolton?.reportForWar()
    }
}