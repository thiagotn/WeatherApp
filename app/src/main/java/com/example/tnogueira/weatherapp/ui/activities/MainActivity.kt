package com.example.tnogueira.weatherapp.ui.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import com.example.tnogueira.weatherapp.R
import com.example.tnogueira.weatherapp.domain.commands.RequestForecastCommand
import com.example.tnogueira.weatherapp.domain.model.Forecast
import com.example.tnogueira.weatherapp.ui.adapters.ForecastListAdapter
import org.jetbrains.anko.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val forecatList: RecyclerView = find(R.id.forecast_list)
        forecatList.layoutManager = LinearLayoutManager(this)

        doAsync {
            val result = RequestForecastCommand("94043").execute()
            uiThread {
                val adapter = ForecastListAdapter(result) { toast(it.date) }
                forecatList.adapter = adapter
            }
        }
    }
}
