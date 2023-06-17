package com.example.campusconnect_aiactr.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.adapters.mtechstudentAdapter
import com.example.campusconnect_aiactr.databinding.ActivityMtechStudentBinding
import com.example.campusconnect_aiactr.pojo.mtechStudentModel

class MTechStudentActivity : AppCompatActivity() {
    lateinit var binding: ActivityMtechStudentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMtechStudentBinding.inflate(layoutInflater )
        setContentView(binding.root)

        val arrMTechStudent=ArrayList<mtechStudentModel>().apply {

            add(mtechStudentModel(R.drawable.one,"HIMANSHU GUPTA","00110100719"))
            add(mtechStudentModel(R.drawable.two,"ANUBHAV THAKUR","00210100719"))
            add(mtechStudentModel(R.drawable.three,"DEEPTI","00510100719"))
            add(mtechStudentModel(R.drawable.four,"VIJAY RATNA NILMANI PRABHAKAR","00610100719"))
            add(mtechStudentModel(R.drawable.six,"SHIVAM AHUJA","00710100719"))
            add(mtechStudentModel(R.drawable.seven,"ABHISHEK","00810100719"))

        }

        binding.rvMTechStudent.layoutManager=LinearLayoutManager(this)

        val adapter=mtechstudentAdapter(this, arrMTechStudent)
        binding.rvMTechStudent.adapter=adapter


        val arrMTechISStudent=ArrayList<mtechStudentModel>().apply {

            add(mtechStudentModel(R.drawable.eight,"MOHIT KUMAR","00110100819"))
            add(mtechStudentModel(R.drawable.ten,"SHIVANI SHARMA","00310100819"))
            add(mtechStudentModel(R.drawable.nine,"HIMANSHU","00410100819"))
            add(mtechStudentModel(R.drawable.one,"VISHAL BHARTI","00510100819"))
            add(mtechStudentModel(R.drawable.two,"KAPIL KUMAR","00610100819"))
        }


        binding.rvMtechISStudent.layoutManager=LinearLayoutManager(this)
        val isstudentadater=mtechstudentAdapter(this,arrMTechISStudent)
        binding.rvMtechISStudent.adapter=isstudentadater



    }
}