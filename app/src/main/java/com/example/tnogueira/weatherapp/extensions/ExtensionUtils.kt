package com.example.tnogueira.weatherapp.extensions

import java.text.DateFormat
import java.util.*

/**
 * Created by tnogueira on 31/05/17.
 */
fun Long.toDateString(dateFormat: Int = DateFormat.MEDIUM): String {
    val df = DateFormat.getDateInstance(dateFormat, Locale.getDefault())
    return df.format(this)
}