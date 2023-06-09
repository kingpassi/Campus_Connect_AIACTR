package com.example.campusconnect_aiactr.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.adapters.academiccalanderAdapter
import com.example.campusconnect_aiactr.databinding.ActivityAcademicCalanderBinding
import com.example.campusconnect_aiactr.pojo.academiccalanderModel

class AcademicCalanderActivity : AppCompatActivity() {
    lateinit var binding: ActivityAcademicCalanderBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
      binding= ActivityAcademicCalanderBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val arrAcademicCalender=ArrayList<academiccalanderModel>().apply {
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))
            add(academiccalanderModel("New academic Calender2023","P.S.Rao","12/08/23"))

        }


        binding.rvAcademicCalander.layoutManager=LinearLayoutManager(this)

        val adapter=academiccalanderAdapter(arrAcademicCalender)
        binding.rvAcademicCalander.adapter=adapter









    }
}