package com.example.tnogueira.weatherapp.extensions

/**
 * Created by tnogueira on 30/05/17.
 */
import android.content.Context
import android.view.View
import android.widget.TextView

val View.ctx: Context
    get() = context

var TextView.textColor: Int
    get() = currentTextColor
    set(v) = setTextColor(v)