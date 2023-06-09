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
        setContentView(R.layout.activity_annual_fee)


        val arrAnnualFee=ArrayList<annualfeesModel>().apply {
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))
            add(annualfeesModel("Title","shared by","DD/MM/YY"))


        }

        binding.rvAnnualFeeNotice.layoutManager=LinearLayoutManager(this)
        val adapter=annualfeesAdapter(arrAnnualFee)
        binding.rvAnnualFeeNotice.adapter=adapter


    }
}