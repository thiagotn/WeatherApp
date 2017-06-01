package com.example.tnogueira.weatherapp.domain.datasource

import com.example.tnogueira.weatherapp.domain.model.Forecast
import com.example.tnogueira.weatherapp.domain.model.ForecastList

/**
 * Created by tnogueira on 30/05/17.
 */
interface ForecastDataSource {

    fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList?

    fun requestDayForecast(id: Long): Forecast?
}