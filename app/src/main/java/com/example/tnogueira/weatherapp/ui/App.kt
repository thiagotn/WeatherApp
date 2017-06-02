package com.example.tnogueira.weatherapp.ui

import android.app.Application
import com.example.tnogueira.weatherapp.extensions.DelegatesExt

/**
 * Created by tnogueira on 30/05/17.
 */
class App : Application() {

    companion object {
        var instance: App by DelegatesExt.notNullSingleValue()
    }

    override fun onCreate() {
        super.onCreate()
        instance = this
    }
}