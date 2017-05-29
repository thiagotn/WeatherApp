package com.example.tnogueira.weatherapp.domain.commands

/**
 * Created by tnogueira on 29/05/17.
 */
interface Command<T> {
    fun execute(): T
}