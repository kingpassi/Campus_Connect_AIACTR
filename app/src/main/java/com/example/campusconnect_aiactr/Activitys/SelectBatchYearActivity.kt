package com.example.campusconnect_aiactr.Activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.campusconnect_aiactr.databinding.ActivitySelectBatchYearBinding

class SelectBatchYearActivity : AppCompatActivity() {
    lateinit var binding: ActivitySelectBatchYearBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySelectBatchYearBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvSelectBatchYear2019.setOnClickListener {
            startActivity(Intent(this,BTechStudentActivity::class.java))
        }

    }
}