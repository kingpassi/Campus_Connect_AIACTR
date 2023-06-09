package com.example.campusconnect_aiactr.Activitys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.adapters.sahfacultyAdapter
import com.example.campusconnect_aiactr.pojo.sahFacultyModel
import com.example.campusconnect_aiactr.databinding.ActivitySahfacultyBinding

class SAHFacultyActivity : AppCompatActivity() {
   lateinit var binding:ActivitySahfacultyBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySahfacultyBinding.inflate(layoutInflater)
        setContentView(binding.root)

     /*   val arrSahFaculty=ArrayList<sahFacultyModel>().apply {
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
            add(sahFacultyModel(R.drawable.one,"Arayan singh","Digital Electronics"))
        }

        binding.rvSAHFaculty.layoutManager= LinearLayoutManager(this)

        val adapter= sahfacultyAdapter(arrSahFaculty)
        binding.rvSAHFaculty.adapter=adapter
*/






    }
}