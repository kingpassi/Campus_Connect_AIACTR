package com.example.campusconnect_aiactr.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.adapters.ecefacultyAdapter
import com.example.campusconnect_aiactr.databinding.ActivityEcefacultyBinding
import com.example.campusconnect_aiactr.pojo.eceFacultyModel
import java.util.zip.Inflater

class ECEFacultyActivity : AppCompatActivity() {

    lateinit var binding: ActivityEcefacultyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityEcefacultyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrECEFaculty=ArrayList<eceFacultyModel>().apply {
            add(eceFacultyModel(R.drawable.one,"Prof. Ravindra Kumar Sharma","rksharma@aiactr.ac.in"))
            add(eceFacultyModel(R.drawable.two,"Prof.Ashok Mittal ","ashokmittal@aiactr.ac.in"))
            add(eceFacultyModel(R.drawable.three,"Prof. Rashmi Gupta ","rashmigupta@aiactr.ac.in"))
            add(eceFacultyModel(R.drawable.five,"Prof .Arti M.K ","artimk@aiactr.ac.in "))
            add(eceFacultyModel(R.drawable.four,"Prof.Soven Kumar Dana ","skdana@aiactr.ac.in"))
            add(eceFacultyModel(R.drawable.one,"Prof.Rajveer Yadhuvanshi ","drrajveersingh@aiactr.ac.in"))
            add(eceFacultyModel(R.drawable.ten,"Prof.Richa Bhatia","richabhatia@aiactr.ac.in"))
            add(eceFacultyModel(R.drawable.two,"Mr.Dinesh Kumar Raheja","dkr102@aiactr.ac.in"))
            add(eceFacultyModel(R.drawable.three,"Dr.Manisha Khulbe","manisha.khulbe@aiactr.ac.in "))
            add(eceFacultyModel(R.drawable.five,"C.S.Vinitha","csvinitha1972@aiactr.ac.in "))
            add(eceFacultyModel(R.drawable.ten,"Dr. Aarti Jain","aartijain@aiactr.ac.in "))
            add(eceFacultyModel(R.drawable.eight,"Dr.Sanjeev Kumar","sanjeevkumar@aiactr.ac.in"))
            add(eceFacultyModel(R.drawable.three,"Dr. Garima Srivastava","garima.srivastav@aiactr.ac.in"))
            add(eceFacultyModel(R.drawable.seven,"Dr. Patteti Krishna","kpatteti@aiactr.ac.in"))
            add(eceFacultyModel(R.drawable.five,"Dr.Kamakshi","kamakshi.kumar2020@aiactr.ac.in"))
            add(eceFacultyModel(R.drawable.nine,"Dr.Avinash Kumar","avinashk@aiactr.ac.in"))

        }
        binding.rvECEFaculty.layoutManager=LinearLayoutManager(this)

        val adapter=ecefacultyAdapter(arrECEFaculty)
        binding.rvECEFaculty.adapter=adapter

    }
}