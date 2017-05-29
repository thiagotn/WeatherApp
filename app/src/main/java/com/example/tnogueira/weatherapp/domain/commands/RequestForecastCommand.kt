package com.example.tnogueira.weatherapp.domain.commands

import com.example.tnogueira.weatherapp.data.ForecastRequest
import com.example.tnogueira.weatherapp.domain.mappers.ForecastDataMapper
import com.example.tnogueira.weatherapp.domain.model.ForecastList

/**
 * Created by tnogueira on 29/05/17.
 */
class RequestForecastCommand(val zipCode: String) : Command<ForecastList> {
    override fun execute(): ForecastList {
        val forecastRequest = ForecastRequest(zipCode)
        return ForecastDataMapper().convertFromDataModel(forecastRequest.execute())
    }
}