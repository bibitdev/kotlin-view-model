package com.bibitdev.myviewmodel

import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    var result = 0

    fun calculate(widht:String, height : String, lenght : String) {
        result = widht.toInt() * height.toInt() * lenght.toInt()
    }
}