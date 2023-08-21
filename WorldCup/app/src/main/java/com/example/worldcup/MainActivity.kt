package com.example.worldcup

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1-Adapter View:ListView
        var listView=findViewById<ListView>(R.id.listView)

        //2-Adapter
        var adapter=MyAdapter(this,generateData())

        listView?.adapter=adapter
        adapter?.notifyDataSetChanged()
    }

    //3-Data Source
    fun generateData():ArrayList<CountryModel>{
        var countrieslist=ArrayList<CountryModel>()

        var country1:CountryModel= CountryModel("Brazil","5",R.drawable.brazil)
        var country2:CountryModel=CountryModel("France","2",R.drawable.france)
        var country3:CountryModel=CountryModel("Spain","1",R.drawable.spain)
        var country4:CountryModel=CountryModel("Germany","4",R.drawable.germany)
        var country5:CountryModel=CountryModel("UK","1",R.drawable.england)
        var country6:CountryModel=CountryModel("Saudi Arabia","0",R.drawable.saudi)
        var country7:CountryModel=CountryModel("USA","0",R.drawable.usa)

        countrieslist.add(country1)
        countrieslist.add(country2)
        countrieslist.add(country3)
        countrieslist.add(country4)
        countrieslist.add(country5)
        countrieslist.add(country6)
        countrieslist.add(country7)

        return countrieslist
    }
}