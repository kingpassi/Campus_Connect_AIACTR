package com.example.campusconnect_aiactr.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.adapters.tnpnoticeAdapter
import com.example.campusconnect_aiactr.databinding.ActivityTnpactivityBinding
import com.example.campusconnect_aiactr.pojo.tnpNoticeModel

class TNPActivity : AppCompatActivity() {
    lateinit var binding: ActivityTnpactivityBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityTnpactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrTnpNotice=ArrayList<tnpNoticeModel>().apply {
            add(tnpNoticeModel("Tnp official Notice27 ","Vishal Bhatnagar","12/05/23"))
            add(tnpNoticeModel("Tnp official Notice26 ","Vishal Bhatnagar","12/04/23"))
            add(tnpNoticeModel("Tnp official Notice25 ","Vishal Bhatnagar","12/03/23"))
            add(tnpNoticeModel("Tnp official Notice24 ","Vishal Bhatnagar","12/02/23"))
            add(tnpNoticeModel("Tnp official Notice23","Vishal Bhatnagar","12/01/23"))
            add(tnpNoticeModel("Tnp official Notice22","Vishal Bhatnagar","12/12/22"))
            add(tnpNoticeModel("Tnp official Notice21 ","Vishal Bhatnagar","12/09/22"))
            add(tnpNoticeModel("Tnp official Notice20 ","Vishal Bhatnagar","12/08/22"))
            add(tnpNoticeModel("Tnp official Notice19 ","Vishal Bhatnagar","12/07/22"))
            add(tnpNoticeModel("Tnp official Notice18 ","Vishal Bhatnagar","12/06/22"))
            add(tnpNoticeModel("Tnp official Notice17 ","Vishal Bhatnagar","12/05/22"))
            add(tnpNoticeModel("Tnp official Notice16 ","Vishal Bhatnagar","12/03/22"))
            add(tnpNoticeModel("Tnp official Notice15 ","Vishal Bhatnagar","12/05/21"))
            add(tnpNoticeModel("Tnp official Notice14 ","Vishal Bhatnagar","12/04/21"))
            add(tnpNoticeModel("Tnp official Notice13 ","Vishal Bhatnagar","12/03/21"))
            add(tnpNoticeModel("Tnp official Notice12 ","Vishal Bhatnagar","12/02/21"))
            add(tnpNoticeModel("Tnp official Notice11 ","Vishal Bhatnagar","12/01/21"))
            add(tnpNoticeModel("Tnp official Notice10 ","Vishal Bhatnagar","12/12/20"))
            add(tnpNoticeModel("Tnp official Notice9 ","Vishal Bhatnagar","12/09/20"))
            add(tnpNoticeModel("Tnp official Notice8 ","Vishal Bhatnagar","12/08/20"))
            add(tnpNoticeModel("Tnp official Notice7 ","Vishal Bhatnagar","12/07/20"))
            add(tnpNoticeModel("Tnp official Notice6 ","Vishal Bhatnagar","12/06/20"))
            add(tnpNoticeModel("Tnp official Notice5 ","Vishal Bhatnagar","12/05/20"))
            add(tnpNoticeModel("Tnp official Notice4 ","Vishal Bhatnagar","12/03/20"))
        }


        binding.rvTnpNotice.layoutManager=LinearLayoutManager(this)
        val adapter=tnpnoticeAdapter(arrTnpNotice)
        binding.rvTnpNotice.adapter=adapter

    }
}