package com.example.campusconnect_aiactr.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.adapters.annualfeesAdapter
import com.example.campusconnect_aiactr.databinding.ActivityAnnualFeeBinding
import com.example.campusconnect_aiactr.pojo.annualfeesModel

class AnnualFeeActivity : AppCompatActivity() {
    lateinit var binding: ActivityAnnualFeeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAnnualFeeBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val arrAnnualFee=ArrayList<annualfeesModel>().apply {
            add(annualfeesModel("Fee Notice 2023","shared by Academic ","17/07/23","https://drive.google.com/file/d/1zZOJIbkY_PUQa3878abFAldT4g5j6gAa/view?usp=sharing"))
            add(annualfeesModel("Fee Notice 2022","shared by Academic","28/09/22","https://drive.google.com/file/d/1EsfIiRkmsTacW6lNhsDxCwlXWI6IfRtp/view?usp=sharing"))
            add(annualfeesModel("Fee Notice 2021","shared by Academic","17/07/21","https://drive.google.com/file/d/1Kg4BopwT7LbFI8VKknUcBrgZq8jwdTk4/view?usp=sharing"))
            add(annualfeesModel("Fee Notice 2020","shared by Academic","17/07/22","https://drive.google.com/file/d/1EWFJupgVmGA5V9IFhNXJEknrupHglsPo/view?usp=sharing"))
            add(annualfeesModel("Fee Notice 2019","shared by Academic","17/07/19","https://drive.google.com/file/d/1zZOJIbkY_PUQa3878abFAldT4g5j6gAa/view?usp=sharing"))
            add(annualfeesModel("Fee Notice 2018","shared by Academic","17/07/18","https://drive.google.com/file/d/1zZOJIbkY_PUQa3878abFAldT4g5j6gAa/view?usp=sharing"))
            add(annualfeesModel("Fee Notice 2017","shared by Academic","17/07/17","https://drive.google.com/file/d/1zZOJIbkY_PUQa3878abFAldT4g5j6gAa/view?usp=sharing"))
            add(annualfeesModel("Fee Notice 2016","shared by Academic","17/07/16","https://drive.google.com/file/d/1zZOJIbkY_PUQa3878abFAldT4g5j6gAa/view?usp=sharing"))
            add(annualfeesModel("Fee Notice 2015","shared by Academic","17/07/15","https://drive.google.com/file/d/1zZOJIbkY_PUQa3878abFAldT4g5j6gAa/view?usp=sharing"))
            add(annualfeesModel("Fee Notice 2014","shared by Academic","17/07/14","https://drive.google.com/file/d/1zZOJIbkY_PUQa3878abFAldT4g5j6gAa/view?usp=sharing"))
            add(annualfeesModel("Fee Notice 2013","shared by Academic","17/07/13","https://drive.google.com/file/d/1zZOJIbkY_PUQa3878abFAldT4g5j6gAa/view?usp=sharing"))
        }

        binding.rvAnnualFeeNotice.layoutManager=LinearLayoutManager(this)
        val adapter= annualfeesAdapter(this, arrAnnualFee)
        binding.rvAnnualFeeNotice.adapter=adapter


    }
}