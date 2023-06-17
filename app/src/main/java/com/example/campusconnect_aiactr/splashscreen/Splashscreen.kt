package com.example.campusconnect_aiactr.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.campusconnect_aiactr.Activitys.LoginActivity
import com.example.campusconnect_aiactr.Activitys.MainActivity
import com.example.campusconnect_aiactr.R

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)



       // val splashScreen= Intent(this, MainActivity::class.java)
        Handler().postDelayed({
            //startActivity(splashScreen)

            val share = getSharedPreferences("login", AppCompatActivity.MODE_PRIVATE)
            val isLogin = share.getBoolean("flag", false)
            if (isLogin) {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
            } else {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
            }

            finish()
        },5000)

    }
}