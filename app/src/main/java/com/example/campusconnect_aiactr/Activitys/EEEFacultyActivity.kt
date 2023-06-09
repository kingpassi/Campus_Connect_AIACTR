package com.example.campusconnect_aiactr.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.adapters.eeefacultyAdapter
import com.example.campusconnect_aiactr.databinding.ActivityEeefacultyBinding
import com.example.campusconnect_aiactr.pojo.eeefacultyModel

class EEEFacultyActivity : AppCompatActivity() {
    lateinit var bindng:ActivityEeefacultyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindng= ActivityEeefacultyBinding.inflate(layoutInflater)
        setContentView(bindng.root)


        val arrEeeFaculty=ArrayList<eeefacultyModel>().apply {
            add(eeefacultyModel(R.drawable.nine,"Dr.Avinash Kumar","avinashk@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.four,"Prof. Nanhay Singh","nsingh1973@aiactr.ac.in "))
            add(eeefacultyModel(R.drawable.four,"Prof.Soven Kumar Dana ","skdana@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.one,"Prof.Rajveer Yadhuvanshi ","drrajveersingh@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.five,"C.S.Vinitha","csvinitha1972@aiactr.ac.in "))
            add(eeefacultyModel(R.drawable.ten,"Dr. Aarti Jain","aartijain@aiactr.ac.in "))
            add(eeefacultyModel(R.drawable.eight,"Dr.Sanjeev Kumar","sanjeevkumar@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.six,"Dr. Vishal Gupta","vishalgupta@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.one,"Mr.Arvind Kumar","arvindkumar@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.ten,"Dr. Amita Jain","amitajain@aiactr.ac.in "))
            add(eeefacultyModel(R.drawable.one,"Prof. Vishal Bhatnagar","vishalbhatnagar@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.two,"Prof. Manoj Kumar","manojkumar@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.ten,"Prof.Richa Bhatia","richabhatia@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.two,"Mr.Dinesh Kumar Raheja","dkr102@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.three,"Dr.Manisha Khulbe","manisha.khulbe@aiactr.ac.in "))
            add(eeefacultyModel(R.drawable.nine,"Dr.Bharti Nagpal ","bhartinagpal@aiactr.ac.in "))
            add(eeefacultyModel(R.drawable.two,"Prof.Ashok Mittal ","ashokmittal@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.three,"Prof. Rashmi Gupta ","rashmigupta@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.five,"Prof .Arti M.K ","artimk@aiactr.ac.in "))
            add(eeefacultyModel(R.drawable.three,"Dr. Garima Srivastava","garima.srivastav@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.seven,"Dr. Patteti Krishna","kpatteti@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.three,"Dr. Garima Srivastava","garima.srivastav@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.five,"Dr.Kamakshi","kamakshi.kumar2020@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.two,"Mr. Prakash Rao Ragiri","prakashrao@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.one,"Prof. Ravindra Kumar Sharma","rksharma@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.seven,"Dr. Suresh Poonia","sureshpoonia@aiactr.ac.in "))
            add(eeefacultyModel(R.drawable.eight,"Dr. Ram Shringar Rao","rsrao@aiactr.ac.in"))
            add(eeefacultyModel(R.drawable.five,"Dr. Shobha Bhatt","bhattsho@aiactr.ac.in "))

        }

        bindng.rvEEEFaculty.layoutManager=LinearLayoutManager(this)

        val adapter=eeefacultyAdapter(arrEeeFaculty)
        bindng.rvEEEFaculty.adapter=adapter




    }
}