package com.example.campusconnect_aiactr.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.campusconnect_aiactr.UserRepo
import com.example.campusconnect_aiactr.database.User
import com.example.campusconnect_aiactr.databinding.ActivitySignupBinding
import kotlinx.coroutines.runBlocking

class SignupActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignupBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySignupBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val userrepo=UserRepo(applicationContext)



        binding.btnCreateAcc.setOnClickListener {
            val user=createUserData()

            runBlocking {
                userrepo.insertUser(user)
            }
            onBackPressed()
        }


    }


    fun createUserData():User{
        val name=binding.edtSignUpName.text.toString()
        val email=binding.edtSignUpEmail.text.toString()
        val password=binding.edtSignUpPassword.text.toString()

        val user=User(email, name, password)
        return user
    }
}