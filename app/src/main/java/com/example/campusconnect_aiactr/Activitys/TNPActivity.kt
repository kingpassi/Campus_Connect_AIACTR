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
            add(tnpNoticeModel("Tnp official Notice27 ","Vishal Bhatnagar","12/05/23","https://drive.google.com/file/d/17Sab3SbIKp4yKjbTN5kH5QgUrfrht1yC/view?usp=sharing"))
            add(tnpNoticeModel("Tnp official Notice26 ","Vishal Bhatnagar","12/04/23","https://drive.google.com/file/d/11gm7Hx8rmRfQSU0nMnxNh0qgLIO5pHIb/view?usp=sharing"))
            add(tnpNoticeModel("Tnp official Notice25 ","Vishal Bhatnagar","12/03/22","https://drive.google.com/file/d/1gs6ksRG-O35G3WgOTIQJJzy5szwLr9qw/view?usp=sharing"))
            add(tnpNoticeModel("Tnp official Notice24 ","Vishal Bhatnagar","12/02/22","https://drive.google.com/file/d/1dG5LcZZY8vVo9GCI6r4bDVwEJAWPOjkO/view?usp=sharing"))
            add(tnpNoticeModel("Tnp official Notice23","Vishal Bhatnagar","12/01/22","https://drive.google.com/file/d/17uW9gjfFKGIqGoDR3a1jLZlMYUZfZAP1/view?usp=sharing"))
            add(tnpNoticeModel("Tnp official Notice22","Vishal Bhatnagar","12/12/22","https://drive.google.com/file/d/1Eh8IAQwXSjDOc9hTHrFWhlXqGTE4PG-g/view?usp=sharing"))
            add(tnpNoticeModel("Tnp official Notice21 ","Vishal Bhatnagar","12/09/21","https://drive.google.com/file/d/1c1xn-adIq1moAjQFbZoH5fEd0FLgduU4/view?usp=sharing"))
            add(tnpNoticeModel("Tnp official Notice20 ","Vishal Bhatnagar","12/08/21","https://drive.google.com/file/d/1S2dsul2srTIcU39E_ZaoVhrkqWw2ylbr/view?usp=sharing"))
            add(tnpNoticeModel("Tnp official Notice19 ","Vishal Bhatnagar","12/07/21","https://drive.google.com/file/d/19YPk1d0kwqHxl477unVl6J7S6YYZiw8V/view?usp=sharing"))
            add(tnpNoticeModel("Tnp official Notice19 ","Vishal Bhatnagar","12/07/21","https://drive.google.com/file/d/1VTbtVIHTF93RBh6Rr2MgTDCk8-IGjDkC/view?usp=sharing"))
            add(tnpNoticeModel("Tnp official Notice19 ","Vishal Bhatnagar","12/07/20","https://drive.google.com/file/d/12sTcMLNf1OPm_DAgIA_Od5KA7tXbcv-D/view?usp=sharing"))
            add(tnpNoticeModel("Tnp official Notice19 ","Vishal Bhatnagar","12/07/20","https://drive.google.com/file/d/1vYAJSLYGZ-LtFkWH9_8OctLxv6jTiRK4/view?usp=sharing"))
             }


        binding.rvTnpNotice.layoutManager=LinearLayoutManager(this)
        val adapter=tnpnoticeAdapter(this, arrTnpNotice)
        binding.rvTnpNotice.adapter=adapter

    }
}