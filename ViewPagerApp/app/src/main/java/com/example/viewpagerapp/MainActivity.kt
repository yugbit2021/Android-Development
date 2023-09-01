package com.example.viewpagerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.viewpager2.widget.ViewPager2
import com.example.viewpagerapp.Adapter.MyAdapter

class MainActivity : AppCompatActivity() {

    lateinit var myAdapter: MyAdapter

    lateinit var viewPager:ViewPager2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager=findViewById(R.id.viewPager)

        myAdapter=MyAdapter(this)

        viewPager.orientation=ViewPager2.ORIENTATION_HORIZONTAL

        viewPager.adapter=myAdapter

    }
}