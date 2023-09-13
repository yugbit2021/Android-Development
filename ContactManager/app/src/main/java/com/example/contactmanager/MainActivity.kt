package com.example.contactmanager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.contactmanager.databinding.ActivityMainBinding
import com.example.contactmanager.databinding.CardItemBinding
import com.example.contactmanager.myViewModel.UserViewModel
import com.example.contactmanager.myViewModel.UserViewModelFactory
import com.example.contactmanager.room.User
import com.example.contactmanager.room.UserDataBase
import com.example.contactmanager.room.UserRepository
import com.example.contactmanager.viewUI.MyRecyclerViewAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var userViewModel: UserViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this,R.layout.activity_main)

        //Room
        val dao=UserDataBase.getInstance(application).userDAO
        val repository=UserRepository(dao)
        val factory=UserViewModelFactory(repository)

        userViewModel=ViewModelProvider(this,
            factory).get(UserViewModel::class.java)

        binding.userViewModel=userViewModel

        binding.lifecycleOwner=this

        initRecyclerView()
    }

    private fun initRecyclerView() {
      binding.recyclerView.layoutManager=LinearLayoutManager(this)
        DisplayUserList()
    }

    private fun listItemClicked(selectedItem: User) {
        Toast.makeText(this,"Selected name is ${selectedItem.name}",Toast.LENGTH_LONG).show()
        userViewModel.initupdateAndDelete(selectedItem)
    }

    private fun DisplayUserList(){
        userViewModel.users.observe(this, Observer {
            binding.recyclerView.adapter=MyRecyclerViewAdapter(
                it,{ selectedItem: User ->listItemClicked(selectedItem)}
            )
        })
    }
}