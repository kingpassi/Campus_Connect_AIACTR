package com.example.campusconnect_aiactr.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.adapters.upcomingeventnoticeAdapter
import com.example.campusconnect_aiactr.databinding.ActivityUpcomingEventsBinding
import com.example.campusconnect_aiactr.pojo.upcomingeventnoticeModel

class UpcomingEventsActivity : AppCompatActivity() {
    lateinit var binding: ActivityUpcomingEventsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityUpcomingEventsBinding.inflate(layoutInflater)
        setContentView(binding.root)


        /*val arrUpcomingEvent=ArrayList<upcomingeventnoticeModel>().apply {
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))
            add(upcomingeventnoticeModel("Title","shared By","DD/MM/YY"))


        }

        binding.rvUpcomingEvent.layoutManager=LinearLayoutManager(this)
        val adapter=upcomingeventnoticeAdapter(arrUpcomingEvent)
        binding.rvUpcomingEvent.adapter=adapter*/


    }
}