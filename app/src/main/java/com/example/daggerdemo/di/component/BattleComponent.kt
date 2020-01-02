package com.example.daggerdemo.di.component

import com.example.daggerdemo.ui.main.War
import dagger.Component

@Component
interface BattleComponent {
    fun getWar(): War
}