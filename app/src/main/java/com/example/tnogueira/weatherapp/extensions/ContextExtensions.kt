package com.example.tnogueira.weatherapp.extensions

import android.content.Context
import android.support.v4.content.ContextCompat

/**
 * Created by tnogueira on 31/05/17.
 */
fun Context.color(res: Int): Int = ContextCompat.getColor(this, res)