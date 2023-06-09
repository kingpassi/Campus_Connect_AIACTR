package com.example.campusconnect_aiactr.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.adapters.scholarshipnoticeAdapter
import com.example.campusconnect_aiactr.databinding.ActivityScholarshipBinding
import com.example.campusconnect_aiactr.pojo.scholarshipnoticeModel

class ScholarshipActivity : AppCompatActivity() {
    lateinit var binding: ActivityScholarshipBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityScholarshipBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val arrScholarshipNotice=ArrayList<scholarshipnoticeModel>().apply {
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))
            add(scholarshipnoticeModel("paisa aa gaya ","Director AIACTR","DD/MM/YY"))

        }

        binding.rvScholarshipNotice.layoutManager=LinearLayoutManager(this)

        val adapter=scholarshipnoticeAdapter(arrScholarshipNotice)
        binding.rvScholarshipNotice.adapter=adapter


    }
}