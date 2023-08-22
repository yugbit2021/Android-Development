package com.example.topgamesapp

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
        var gamesList:ArrayList<GameModel> = ArrayList()
        val g1=GameModel(R.drawable.g1,"Pubg")
        val g2=GameModel(R.drawable.g2,"Free Fire")
        val g4=GameModel(R.drawable.g4,"Candy Crush")
        val g5=GameModel(R.drawable.g5,"Temple Run")
        val g3=GameModel(R.drawable.g3,"Asphalt Nitro")
        val g6=GameModel(R.drawable.g6,"Pokemon Go")
        val g7=GameModel(R.drawable.g7,"Ludo")

        gamesList.add(g1)
        gamesList.add(g2)
        gamesList.add(g3)
        gamesList.add(g4)
        gamesList.add(g5)
        gamesList.add(g6)
        gamesList.add(g7)

        //3-Adapter
        val adapter=GameAdapter(gamesList)
        recyclerView.adapter=adapter
    }
}