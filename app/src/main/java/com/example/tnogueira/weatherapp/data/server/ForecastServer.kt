package com.example.tnogueira.weatherapp.data.server

import com.example.tnogueira.weatherapp.data.db.ForecastDb
import com.example.tnogueira.weatherapp.domain.datasource.ForecastDataSource
import com.example.tnogueira.weatherapp.domain.model.Forecast
import com.example.tnogueira.weatherapp.domain.model.ForecastList

/**
 * Created by tnogueira on 31/05/17.
 */
class ForecastServer(val dataMapper: ServerDataMapper = ServerDataMapper(),
                     val forecastDb: ForecastDb = ForecastDb()) : ForecastDataSource {

    override fun requestForecastByZipCode(zipCode: Long, date: Long): ForecastList? {
        val result = ForecastByZipCodeRequest(zipCode).execute()
        val converted = dataMapper.convertToDomain(zipCode, result)
        forecastDb.saveForecast(converted)
        return forecastDb.requestForecastByZipCode(zipCode, date)
    }

    override fun requestDayForecast(id: Long) = throw UnsupportedOperationException()
}