package com.example.contactmanager.room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity("user")
data class User(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo("user_id")
    val id:Int,

    @ColumnInfo("user_name")
    var name:String,

    @ColumnInfo("user_email")
    var email:String)
