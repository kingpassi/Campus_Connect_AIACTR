package com.example.campusconnect_aiactr.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
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
            add(scholarshipnoticeModel("NSP ScholarShip Notice 2020 ","Director AIACTR","22/11/20","https://drive.google.com/file/d/1QQasepyrSXDT9w_Qy6gl2re4H5ppECXV/view?usp=sharing"))
            add(scholarshipnoticeModel("Merit-cum-Means ScholarShip Notice 2019 ","Director AIACTR","14/08/19","https://drive.google.com/file/d/1_PbZMR7Wj561E4SFbFII1eiG6nE9y9ik/view?usp=sharing"))
            add(scholarshipnoticeModel("For J&K Students ScholarShip Notice 2019","Director AIACTR","09/12/19","https://drive.google.com/file/d/1Z4LS3WcFfMlwfM-twkLpbuTi7DMpLyLQ/view?usp=sharing"))
            add(scholarshipnoticeModel("Post Metric ScholarShip Notice 2019 ","Director AIACTR","27/11/19","https://drive.google.com/file/d/1LVGsHeKejyifMde2J2cYaGWvIYNrxHH3/view?usp=sharing"))
            add(scholarshipnoticeModel("Merit-cum-Means ScholarShip Notice 2018","Director AIACTR","03/12/18","https://drive.google.com/file/d/1QbLXiaXwaWsVXHGTuEbrlaJIRb0g3BQB/view?usp=sharing"))
            add(scholarshipnoticeModel("Merit-cum-Means ScholarShip Notice 2017 ","Director AIACTR","06/04/17","https://drive.google.com/file/d/1gq9vmn32zcmYBXyV9bTZ6W6yEvXiKOid/view?usp=sharing"))

        }

        binding.rvScholarshipNotice.layoutManager=LinearLayoutManager(this)

        val adapter=scholarshipnoticeAdapter(this, arrScholarshipNotice)
        binding.rvScholarshipNotice.adapter=adapter


    }
}