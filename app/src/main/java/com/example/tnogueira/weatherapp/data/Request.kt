package com.example.tnogueira.weatherapp.data

import android.util.Log
import java.net.URL

/**
 * Created by tnogueira on 26/05/17.
 */
class Request(val url: String) {

    fun run () {
        val forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}