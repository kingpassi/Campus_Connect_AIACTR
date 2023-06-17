package com.example.campusconnect_aiactr.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.adapters.ecestudentAdapter
import com.example.campusconnect_aiactr.databinding.ActivityEcestudentBinding
import com.example.campusconnect_aiactr.pojo.eceStudentModel

class ECEStudentActivity : AppCompatActivity() {
    lateinit var binding:ActivityEcestudentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityEcestudentBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val arreceStudent=ArrayList<eceStudentModel>().apply {

            add(eceStudentModel("HIMANSHU KUMAR","07610102819",R.drawable.one))
            add(eceStudentModel("AMAYYA VIKRAMM SINGH RAWAT","07710102819",R.drawable.two))
            add(eceStudentModel("SONU KUMAR","07810102819",R.drawable.four))
            add(eceStudentModel("HIMANSHU SINGH DHAPOLA","07910102819",R.drawable.six))
            add(eceStudentModel("SHAHBAZ KHAN","08010102819",R.drawable.seven))
            add(eceStudentModel("AKASH UPADHYAY","08110102819",R.drawable.eight))
            add(eceStudentModel("ANKIT KUMAR","08210102819",R.drawable.nine))
            add(eceStudentModel("YASH","08310102819",R.drawable.one))
            add(eceStudentModel("SHRISTY","08410102819",R.drawable.three))
            add(eceStudentModel("RAHUL KUMAR","08510102819",R.drawable.two))
            add(eceStudentModel("SARIM KHAN","08610102819",R.drawable.four))
            add(eceStudentModel("ANKIT KUMAR","08710102819",R.drawable.six))
            add(eceStudentModel("DURGA PRASAD","08810102819",R.drawable.seven))
            add(eceStudentModel("SAURABH KUMAR","08910102819",R.drawable.eight))
            add(eceStudentModel("AJAY MEHRA","09010102819",R.drawable.nine))
            add(eceStudentModel("ABHISHEK SHARMA","09110102819",R.drawable.one))
            add(eceStudentModel("SHUBHAM","09210102819",R.drawable.two))
            add(eceStudentModel("JEEVAN KUMAR","09310102819",R.drawable.four))
            add(eceStudentModel("SAHIL GAUTAM","09410102819",R.drawable.six))
            add(eceStudentModel("ARSHAD IQBAL","09510102819",R.drawable.seven))
            add(eceStudentModel("SHREYA CHAUHAN","09610102819",R.drawable.five))
            add(eceStudentModel("ABDUL AHAD","09710102819",R.drawable.eight))
            add(eceStudentModel("RITESH JHA","09810102819",R.drawable.nine))
            add(eceStudentModel("SHIVAM TIWARI","09910102819",R.drawable.one))
            add(eceStudentModel("ROHIT SHARMA","10010102819",R.drawable.two))
            add(eceStudentModel("NAVRATAN","10110102819",R.drawable.four))
            add(eceStudentModel("RISHABH SAINI","10210102819",R.drawable.six))
            add(eceStudentModel("SHUBHAM KUMAR GAUR","10310102819",R.drawable.seven))
            add(eceStudentModel("PRAVEER PRAKASH DUBEY ","10410102819",R.drawable.eight))
            add(eceStudentModel("SUKHVINDER","10510102819",R.drawable.nine))
            add(eceStudentModel("PRAVEEN MISHRA","10610102819",R.drawable.one))
            add(eceStudentModel("RADHIKAA  KAPOOR","10710102819",R.drawable.ten))
            add(eceStudentModel("RIYA BISHT","10810102819",R.drawable.three))
            add(eceStudentModel("ASHISH","10910102819",R.drawable.two))
            add(eceStudentModel("PRIYANSHU BHARGAVE","11010102819",R.drawable.four))
            add(eceStudentModel("AMARDEEP SINGH","11110102819",R.drawable.six))
            add(eceStudentModel("SAKSHI BHARDWAJ","11210102819",R.drawable.five))
            add(eceStudentModel("MUKUL KUMAR","11310102819",R.drawable.seven))
            add(eceStudentModel("RIDDIKA GROVER","11410102819",R.drawable.ten))
            add(eceStudentModel("RAVI RAJPUT","11510102819",R.drawable.eight))
            add(eceStudentModel("ANUJ MAURYA","11610102819",R.drawable.nine))
            add(eceStudentModel("SHUBHAM TIWARI","11710102819",R.drawable.one))
            add(eceStudentModel("VAIBHAV","11810102819",R.drawable.two))
            add(eceStudentModel("GAURAV KUMAR","11910102819",R.drawable.four))
            add(eceStudentModel("SURAJ SINGH","12010102819",R.drawable.six))
            add(eceStudentModel("KARAN YADAV","12110102819",R.drawable.seven))
            add(eceStudentModel("NEERAJ GUPTA","12210102819",R.drawable.eight))
            add(eceStudentModel("SACHIN","12310102819",R.drawable.nine))
            add(eceStudentModel("SIDDHARTH","12410102819",R.drawable.one))
            add(eceStudentModel("MD REHAN","12510102819",R.drawable.two))
            add(eceStudentModel("SHIVAM","12610102819",R.drawable.four))
            add(eceStudentModel("MD SHOKEEN KHAN","12710102819",R.drawable.six))
            add(eceStudentModel("RITIK KUMAR","12810102819",R.drawable.seven))
            add(eceStudentModel("BHANU PRATAP SINGH","12910102819",R.drawable.eight))
            add(eceStudentModel("AYUSH PAL","13010102819",R.drawable.nine))
            add(eceStudentModel("ABHISHEK SHARMA","13110102819",R.drawable.one))
            add(eceStudentModel("SANYAM JAIN","13210102819",R.drawable.two))
            add(eceStudentModel("ANURAG TYAGI","13310102819",R.drawable.four))
            add(eceStudentModel("KARAN","13410102819",R.drawable.six))
            add(eceStudentModel("NITESH","13510102819",R.drawable.seven))
            add(eceStudentModel("ISHU MEHRA","13610102819",R.drawable.three))
            add(eceStudentModel("DIVYANSHU UPADHYAY","13710102819",R.drawable.eight))
            add(eceStudentModel("YASH KHERA","13810102819",R.drawable.nine))
            add(eceStudentModel("ROHAN SHARMA","13910102819",R.drawable.one))
            add(eceStudentModel("ANURAG KUMAR","14010102819",R.drawable.two))
            add(eceStudentModel("CHIRAG GAUTAM","14110102819",R.drawable.four))
            add(eceStudentModel("TUSHAR JAIN","14210102819",R.drawable.six))
            add(eceStudentModel("SUNNY KUMAR","14310102819",R.drawable.seven))
        }


        binding.rvECEStudent.layoutManager=GridLayoutManager(this,2)

       val adapter=ecestudentAdapter(this, arreceStudent)
        binding.rvECEStudent.adapter=adapter








    }
}