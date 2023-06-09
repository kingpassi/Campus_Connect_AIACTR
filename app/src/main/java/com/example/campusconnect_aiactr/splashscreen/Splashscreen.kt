package com.example.campusconnect_aiactr.splashscreen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.campusconnect_aiactr.Activitys.MainActivity
import com.example.campusconnect_aiactr.R

class splashscreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashscreen)



        val splashScreen= Intent(this, MainActivity::class.java)
        Handler().postDelayed({
            startActivity(splashScreen)
            finish()
        },5000)

    }
}