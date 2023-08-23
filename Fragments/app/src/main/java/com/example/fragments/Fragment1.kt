package com.example.fragments

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast


class Fragment1 : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Toast.makeText(context,"On Attach() method is called",Toast.LENGTH_SHORT).show()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(context,"On Create() method is called",Toast.LENGTH_SHORT).show()
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Toast.makeText(context,"On createView() method is called",Toast.LENGTH_SHORT).show()
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(context,"Onstart() method is called",Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(context,"OnResume() method is called",Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(context,"OnPause() method is called",Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(context,"Onstop() method is called",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Toast.makeText(context,"OnDestroyView() method is called",Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(context,"OnDestroy() method is called",Toast.LENGTH_SHORT).show()
    }

    override fun onDetach() {
        super.onDetach()
        Toast.makeText(context,"OnDetach() method is called",Toast.LENGTH_SHORT).show()
    }
}