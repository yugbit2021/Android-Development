package com.example.viewpagerapp.Adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpagerapp.MainActivity
import com.example.viewpagerapp.fragments.FragmentOne
import com.example.viewpagerapp.fragments.FragmentThree
import com.example.viewpagerapp.fragments.FragmentTwo

class MyAdapter(mainActivity: MainActivity):FragmentStateAdapter(mainActivity) {

    private val Fragments_size=3;
    override fun getItemCount(): Int {
        return this.Fragments_size
    }

    override fun createFragment(position: Int): Fragment {

        when(position){
            0->{
                return FragmentOne()
            }
            1->{
                return FragmentTwo()
            }
            2->{
                return FragmentThree()
            }

        }
        return FragmentOne()
    }
}