package com.example.fitnext

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import com.anychart.AnyChart
import com.anychart.AnyChartView
import com.anychart.chart.common.dataentry.DataEntry
import com.anychart.chart.common.dataentry.ValueDataEntry

class dashbord : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashbord)

        val pie = AnyChart.pie()

        val data: MutableList<DataEntry> = ArrayList()
        data.add(ValueDataEntry("John", 10000))
        data.add(ValueDataEntry("Jake", 12000))
        data.add(ValueDataEntry("Peter", 18000))

        pie.data(data)

        val anyChartView = findViewById<AnyChartView>(R.id.any_chart_view)
        anyChartView.setChart(pie)

        val btn1 = findViewById<ImageButton>(R.id.imageButton10)
        btn1.setOnClickListener(){
            val inten = Intent(this, notification::class.java)
            startActivity(inten)
        }

        val btn2 = findViewById<ImageButton>(R.id.imageButton)
        btn2.setOnClickListener(){
            val inten = Intent(this, profile::class.java)
            startActivity(inten)
        }
    }
}