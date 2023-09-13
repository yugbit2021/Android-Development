package com.example.contactmanager.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [User::class], version = 1)
abstract class UserDataBase:RoomDatabase() {

    abstract val userDAO:UserDAO

    //Singleton
    companion object{
        @Volatile
        private var INSTANCE:UserDataBase?=null
        fun getInstance(context: Context):UserDataBase{
            synchronized(this){
                var instance= INSTANCE
                if(instance==null){
                    instance=Room.databaseBuilder(
                        context.applicationContext,
                        UserDataBase::class.java,
                        "users_db"
                    ).build()
                }
                return instance
            }
        }
    }
}