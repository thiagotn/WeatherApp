package com.example.tnogueira.weatherapp.domain.commands

import com.example.tnogueira.weatherapp.domain.datasource.ForecastProvider
import com.example.tnogueira.weatherapp.domain.model.ForecastList

/**
 * Created by tnogueira on 29/05/17.
 */
class RequestForecastCommand(
        val zipCode: Long,
        val forecastProvider: ForecastProvider = ForecastProvider()) :
        Command<ForecastList> {

    companion object {
        val DAYS = 7
    }

    override fun execute() = forecastProvider.requestByZipCode(zipCode, DAYS)
}