package com.example.campusconnect_aiactr.Activitys

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.example.campusconnect_aiactr.UserRepo
import com.example.campusconnect_aiactr.database.AppDatabase
import com.example.campusconnect_aiactr.databinding.ActivityLoginBinding
import kotlinx.coroutines.launch


class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    var user:Int=-1

    private var appDatabase: AppDatabase? = null
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        appDatabase = AppDatabase.getDatabase(this)

        val userrepo=UserRepo(applicationContext)

        binding.btnLogin.setOnClickListener {
            val email= binding.edtLoginEmail.text.toString()
            val password=binding.edtLoginPassword.text.toString()

            lifecycleScope.launch {
                try {
                   user = userrepo.readLoginData(email, password)
                    // Handle the result here
                } catch (e: Exception) {
                    // Handle any exceptions that may occur
                }
            }

            Handler().postDelayed({
                if(user==1){
                    val pref = getSharedPreferences("login", MODE_PRIVATE)
                    val editor = pref.edit()
                    editor.putBoolean("flag",true)
                    editor.apply()

                    val intent = Intent(this, MainActivity::class.java)
                    startActivity(intent)
                }
                else{
                    Log.d("eabcder","not  Login")
                }
            },1000)




        }
        binding.tvSignUp.setOnClickListener {
            val intent = Intent(this, SignupActivity::class.java)
            startActivity(intent)
        }


    }

}
