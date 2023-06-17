package com.example.campusconnect_aiactr.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
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
            add(academiccalanderModel("Academic Calender2022","Shared by GGSIPU","04/07/22","https://drive.google.com/file/d/1eCas6UEHxwn8YVUq2VsVKRrY7k3BO12u/view?usp=sharing"))
            add(academiccalanderModel("Academic Calender2022","Shared by GGSIPU","04/07/22","https://drive.google.com/file/d/1r6KAaL-UcX0IYXYebRbJGAA0ueAZUhyr/view?usp=sharing"))
            add(academiccalanderModel("Academic Calender2022","Shared by GGSIPU","04/07/22","https://drive.google.com/file/d/1cOLYnRO8NNt7rdTUr75-f_XbyMU5KEgL/view?usp=sharing"))
            add(academiccalanderModel("Academic Calender2021","Shared by GGSIPU","12/10/21","https://drive.google.com/file/d/1_4HHjmdClkbWQf0sDsx5njTmEHHOtpJr/view?usp=sharing"))
        }


        binding.rvAcademicCalander.layoutManager=LinearLayoutManager(this)

        val adapter=academiccalanderAdapter(this, arrAcademicCalender)
        binding.rvAcademicCalander.adapter=adapter









    }
}