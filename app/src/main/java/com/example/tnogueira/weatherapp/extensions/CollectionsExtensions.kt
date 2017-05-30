package com.example.tnogueira.weatherapp.extensions

/**
 * Created by tnogueira on 30/05/17.
 */
fun<K, V : Any> Map<K, V?>.toVarargArray(): Array<out Pair<K, V>> =
        map({ Pair(it.key, it.value!!) }).toTypedArray()