package com.example.campusconnect_aiactr.Activitys

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.databinding.ActivityBtechStudentBinding

class BTechStudentActivity : AppCompatActivity() {
    lateinit var binding: ActivityBtechStudentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityBtechStudentBinding.inflate(layoutInflater)
        setContentView(binding.root)



        binding.CSEStudentCardView.setOnClickListener {
            val CSEStudentIntent=Intent(this,CSEStudentActivity::class.java)
            startActivity(CSEStudentIntent)
        }

        binding.ECEStudentCardView.setOnClickListener {
            val ECEStudentIntent=Intent(this,ECEStudentActivity::class.java)
            startActivity(ECEStudentIntent)
        }

    }
}