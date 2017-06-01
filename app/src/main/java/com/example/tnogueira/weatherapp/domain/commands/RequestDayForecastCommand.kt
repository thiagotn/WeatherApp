package com.example.tnogueira.weatherapp.domain.commands

import com.example.tnogueira.weatherapp.domain.datasource.ForecastProvider
import com.example.tnogueira.weatherapp.domain.model.Forecast

/**
 * Created by tnogueira on 31/05/17.
 */
class RequestDayForecastCommand(
        val id: Long,
        val forecastProvider: ForecastProvider = ForecastProvider()) :
        Command<Forecast> {

    override fun execute() = forecastProvider.requestForecast(id)
}