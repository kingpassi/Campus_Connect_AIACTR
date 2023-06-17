package com.example.campusconnect_aiactr.database

import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "users")
data class User(
    @PrimaryKey
    var email_Id: String,
    var user_name:String,
    var password: String
)


