package com.example.campusconnect_aiactr

import android.content.Context
import android.database.sqlite.SQLiteConstraintException
import com.example.campusconnect_aiactr.database.AppDatabase
import com.example.campusconnect_aiactr.database.User


class UserRepo(private val context: Context) {

    private val userDao = AppDatabase.getDatabase(context).getDao()
    suspend fun insertUser(user: User): Boolean {
        return try {
            userDao.insertUser(user)
            true
        } catch (e: SQLiteConstraintException) {
            false
        }
    }

    suspend fun updateUser(user: User) {
        userDao.updateUser(user)
    }

    fun readLoginData(id: String, password: String): Int {
    if (userDao.readLoginData(id, password)!=null){
        return 1
    }
        else
            return 0
    }

    fun getUserDetails(id: String): User? {
        return userDao.getUserDetails(id)
    }

}