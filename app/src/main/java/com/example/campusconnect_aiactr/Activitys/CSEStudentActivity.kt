package com.example.campusconnect_aiactr.Activitys

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.campusconnect_aiactr.databinding.ActivityCsestudentBinding

class CSEStudentActivity : AppCompatActivity() {
    lateinit var binding: ActivityCsestudentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCsestudentBinding.inflate(layoutInflater)
        setContentView(binding.root)







    }
}