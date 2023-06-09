package com.example.campusconnect_aiactr.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.adapters.csefacultyAdapter
import com.example.campusconnect_aiactr.databinding.ActivityCsefacultyBinding
import com.example.campusconnect_aiactr.pojo.cseFacultyModel
import com.example.campusconnect_aiactr.pojo.sahFacultyModel

class CSEFacultyActivity : AppCompatActivity() {
    lateinit var binding: ActivityCsefacultyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityCsefacultyBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrCseFaculty=ArrayList<cseFacultyModel>().apply {
            add(cseFacultyModel(R.drawable.one,"Prof. Vishal Bhatnagar","vishalbhatnagar@aiactr.ac.in"))
            add(cseFacultyModel(R.drawable.two,"Prof. Manoj Kumar","manojkumar@aiactr.ac.in"))
            add(cseFacultyModel(R.drawable.four,"Prof. Nanhay Singh","nsingh1973@aiactr.ac.in "))
            add(cseFacultyModel(R.drawable.six,"Dr. Vishal Gupta","vishalgupta@aiactr.ac.in"))
            add(cseFacultyModel(R.drawable.seven,"Dr. Suresh Poonia","sureshpoonia@aiactr.ac.in "))
            add(cseFacultyModel(R.drawable.eight,"Dr. Ram Shringar Rao","rsrao@aiactr.ac.in"))
            add(cseFacultyModel(R.drawable.five,"Dr. Shobha Bhatt","bhattsho@aiactr.ac.in "))
            add(cseFacultyModel(R.drawable.nine,"Dr.Bharti Nagpal ","bhartinagpal@aiactr.ac.in "))
            add(cseFacultyModel(R.drawable.one,"Mr.Arvind Kumar","arvindkumar@aiactr.ac.in"))
            add(cseFacultyModel(R.drawable.ten,"Dr. Amita Jain","amitajain@aiactr.ac.in "))
            add(cseFacultyModel(R.drawable.two,"Mr. Prakash Rao Ragiri","prakashrao@aiactr.ac.in"))
        }

        binding.rvCSEFaculty.layoutManager=LinearLayoutManager(this)

        val adapter=csefacultyAdapter(arrCseFaculty)
        binding.rvCSEFaculty.adapter=adapter


    }
}