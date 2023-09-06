package com.example.viewmodel

import androidx.lifecycle.ViewModel

class MainActivityViewModel(startingNum:Int):ViewModel() {
    private var counter=0;

    init {
        counter=startingNum
    }

    fun genCurrentCount():Int{
        return counter
    }

    fun getUpdatedCount():Int{
        return ++counter
    }
}