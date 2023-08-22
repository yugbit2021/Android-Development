package com.example.vacineapp_recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //1-AdapterView:RecylerView
        val recyclerView:RecyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)

        //2-DataSource
        val vaccineList:ArrayList<VaccineModel> = ArrayList()
        val v1= VaccineModel("Covid 19",R.drawable.vaccine5)
        val v2=VaccineModel("Hepatitis B Vaccine",R.drawable.vaccine2)
        val v3=VaccineModel("Tatnus Vaccine",R.drawable.vaccine10)
        val v4=VaccineModel("Pneumocal vaccine",R.drawable.vaccine9)
        val v5=VaccineModel("Rotavirus vaccine",R.drawable.vaccine8)
        val v6=VaccineModel("Measles Vaccine",R.drawable.vaccine7)
        val v7=VaccineModel("Chickenpox Vaccine",R.drawable.vaccine6)

        vaccineList.add(v1)
        vaccineList.add(v2)
        vaccineList.add(v3)
        vaccineList.add(v4)
        vaccineList.add(v5)
        vaccineList.add(v6)
        vaccineList.add(v7)

        //3-Adapter
        val adapter=MyAdapter(vaccineList)
        recyclerView.adapter=adapter
    }
}