package com.example.campusconnect_aiactr.Activitys

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.adapters.csestudentAdapter
import com.example.campusconnect_aiactr.databinding.ActivityCsestudentBinding
import com.example.campusconnect_aiactr.pojo.cseStudentModel

class CSEStudentActivity : AppCompatActivity() {
    lateinit var binding: ActivityCsestudentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCsestudentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val arrcseStudent=ArrayList<cseStudentModel>().apply {

            //3 5 10
            //1  2 4 6 7 8 9
             add(cseStudentModel("ABHIJEET THAKUR","00110102719", R.drawable.one))
             add(cseStudentModel("SAKSHI TIWARI","00210102719", R.drawable.five))
             add(cseStudentModel("AASHUTOSH PATHAK","00310102719", R.drawable.two))
             add(cseStudentModel("AMIT RAJ PUSHKAR","00410102719", R.drawable.four))
             add(cseStudentModel("KARTIK","00510102719", R.drawable.six))
             add(cseStudentModel("DIMPLE VERMA","00610102719", R.drawable.ten))
             add(cseStudentModel("TANYA GOYAL","00710102719", R.drawable.three))
             add(cseStudentModel("PRAVEEN KUMAR JHA","00810102719", R.drawable.seven))
             add(cseStudentModel("DIVYESH KUMAR CHOUDHARY","00910102719", R.drawable.eight))
             add(cseStudentModel("SANDEEP PANDEY","01010102719", R.drawable.nine))
             add(cseStudentModel("HARSH KUMAR","01110102719", R.drawable.one))
             add(cseStudentModel("AMAN KUMAR SHARMA","01210102719", R.drawable.two))
             add(cseStudentModel("KUNAL TRIPATHI","01310102719", R.drawable.two))
             add(cseStudentModel("NAMAN","01410102719", R.drawable.four))
             add(cseStudentModel("PAWAN KUMAR","01510102719", R.drawable.six))
             add(cseStudentModel("MAYANK SHARMA","01610102719", R.drawable.seven))
             add(cseStudentModel("RAJAT CHAUHAN","01710102719", R.drawable.eight))
             add(cseStudentModel("RAYAPATI VIJAY RAGHAV","01810102719", R.drawable.nine))
             add(cseStudentModel("VARUN KUMAR","01910102719", R.drawable.one))
             add(cseStudentModel("KARTIK CHAUHAN","02010102719", R.drawable.two))
             add(cseStudentModel("KUSHAL SHARMA","02110102719", R.drawable.four))
             add(cseStudentModel("ANUKOOL RATHI","02210102719", R.drawable.six))
             add(cseStudentModel("ANKIT KUMAR","02310102719", R.drawable.seven))
             add(cseStudentModel("SOURAV KUMAR","02410102719", R.drawable.eight))
             add(cseStudentModel("SAMYAK JAIN","02510102719", R.drawable.nine))
             add(cseStudentModel("SATYAM KUMAR JHA","02610102719", R.drawable.one))
             add(cseStudentModel("PRIYANSHU GUPTA","02710102719", R.drawable.two))
             add(cseStudentModel("RAGHAV GUPTA","02810102719", R.drawable.four))
             add(cseStudentModel("KARTIK SINGH","02910102719", R.drawable.six))
             add(cseStudentModel("SHIVAM YADAV","03010102719", R.drawable.seven))
             add(cseStudentModel("AYAAN LONE","03110102719", R.drawable.eight))
             add(cseStudentModel("GURPREET SINGH","03210102719", R.drawable.nine))
             add(cseStudentModel("ASHWINI ANAND OJHA","03310102719", R.drawable.one))
             add(cseStudentModel("VICKY PANDEY","03410102819", R.drawable.two))
             add(cseStudentModel("JEEVAN GAUTAM","03510102819", R.drawable.one))
             add(cseStudentModel("RITESH GUPTA","03610102819", R.drawable.two))
             add(cseStudentModel("ATIF ABDUR RAHMAN","03710102819", R.drawable.four))
             add(cseStudentModel("RAHUL AGRAWAL","03810102819", R.drawable.six))
             add(cseStudentModel("ANANY SHARMA","03910102819", R.drawable.seven))
             add(cseStudentModel("AKANSHU","04010102819", R.drawable.eight))
             add(cseStudentModel("ARYAN SAINI","04110102819", R.drawable.nine))
             add(cseStudentModel("ABHISHEK","04210102819", R.drawable.one))
             add(cseStudentModel("ANKIT KUMAR SINGH","04310102819", R.drawable.two))
             add(cseStudentModel("RITESH KUMAR","04410102819", R.drawable.four))
             add(cseStudentModel("NAVEEN KUMAR","04510102819", R.drawable.six))
             add(cseStudentModel("PARTH SHARMA","04610102819", R.drawable.seven))
             add(cseStudentModel("AYUSHMAAN JANGID","04710102819", R.drawable.eight))
             add(cseStudentModel("OM PRAKASH KUMAR YADAV","04810102819", R.drawable.nine))
             add(cseStudentModel("AMAN KUMAR MAHTO","04910102819", R.drawable.one))
             add(cseStudentModel("MAYANK","05010102819", R.drawable.two))
             add(cseStudentModel("SIDDHARTH RAJAN","05110102819", R.drawable.four))
             add(cseStudentModel("LAKSHAY MALIK","05210102819", R.drawable.six))
             add(cseStudentModel("VAIBHAV YADAV","05310102819", R.drawable.seven))
             add(cseStudentModel("MOHD IFRAZ","05410102819", R.drawable.eight))
             add(cseStudentModel("ASHUTOSH KUMAR","05510102819", R.drawable.nine))
             add(cseStudentModel("MD SHAMS REZA","05610102819", R.drawable.one))
             add(cseStudentModel("DEEPALI VERMA","05710102819", R.drawable.ten)) //10
             add(cseStudentModel("BRAHAT K SINGH","05810102819", R.drawable.two))
             add(cseStudentModel("SUDHANSHU TIWARI","05910102819", R.drawable.four))
             add(cseStudentModel("JATIN","06010102819", R.drawable.four))
             add(cseStudentModel("UTTAM KUMAR SINGH","06110102819", R.drawable.six))
             add(cseStudentModel("ABHINAV JOSHI","06210102819", R.drawable.seven))
             add(cseStudentModel("SHUBHAM KHARALIYA","06310102819", R.drawable.eight))
             add(cseStudentModel("SOURABH SEJWAL","06410102819", R.drawable.nine))
             add(cseStudentModel("NAVJOT KUMAR","06510102819", R.drawable.one))
             add(cseStudentModel("ADITYA KUSHWAHA","06610102819", R.drawable.two))
             add(cseStudentModel("AASHI GUPTA","06710102819", R.drawable.four))
             add(cseStudentModel("ARSHAD IQBAL","06810102819", R.drawable.six))
             add(cseStudentModel("PRITHVI PAL","06910102819", R.drawable.seven))
             add(cseStudentModel("PAWAN KUMAR VERMA","07010102819", R.drawable.eight))
              }




     binding.rvCSEStudent.layoutManager=GridLayoutManager(this, 3)
     val adapter=csestudentAdapter(this, arrcseStudent)
       binding.rvCSEStudent.adapter=adapter

    }



}