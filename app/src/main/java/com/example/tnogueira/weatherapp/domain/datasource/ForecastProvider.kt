package com.example.tnogueira.weatherapp.domain.datasource

import com.example.tnogueira.weatherapp.data.db.ForecastDb
import com.example.tnogueira.weatherapp.data.server.ForecastServer
import com.example.tnogueira.weatherapp.domain.model.ForecastList
import com.example.tnogueira.weatherapp.extensions.firstResult

/**
 * Created by tnogueira on 31/05/17.
 */
class ForecastProvider(val sources: List<ForecastDataSource> = ForecastProvider.SOURCES) {

    companion object {
        val DAY_IN_MILLIS = 1000 * 60 * 24
        val SOURCES = listOf(ForecastDb(), ForecastServer())
    }

    fun requestByZipCode(zipCode: Long, days: Int): ForecastList
            = sources.firstResult { requestSource(it, days, zipCode) }

    private fun requestSource(source: ForecastDataSource, days: Int, zipCode: Long): ForecastList? {
        val res = source.requestForecastByZipCode(zipCode, todayTimeSpan())
        return if (res != null && res.size >= days) res else null
    }

    private fun todayTimeSpan() = System.currentTimeMillis() / DAY_IN_MILLIS
}


