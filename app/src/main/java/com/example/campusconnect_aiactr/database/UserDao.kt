package com.example.campusconnect_aiactr.database

import androidx.room.*

@Dao
interface UserDao {

    @Insert
    suspend fun insertUser(user: User)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    suspend fun updateUser(user: User)

    @Query("SELECT * FROM users WHERE email_Id LIKE :id AND password LIKE :password")
    fun readLoginData(id :String , password : String) : User?

    @Query("select * from users where email_Id LIKE :id")
    fun getUserDetails(id: String ) : User?

}

