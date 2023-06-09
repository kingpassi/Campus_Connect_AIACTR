package com.example.campusconnect_aiactr.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment
import com.example.campusconnect_aiactr.Activitys.BTechStudentActivity
import com.example.campusconnect_aiactr.Activitys.MTechStudentActivity
import com.example.campusconnect_aiactr.Activitys.SelectBatchYearActivity
import com.example.campusconnect_aiactr.Activitys.StudentCommunityActivity
import com.example.campusconnect_aiactr.R

class StudentFragment : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val BTechStudent=view.findViewById<CardView>(R.id.BTechStudentCardView)
        val MtechStudent=view.findViewById<CardView>(R.id.MTechStudentCardView)
        val StudentCommunity=view.findViewById<CardView>(R.id.StudentCommunityCardView)


        BTechStudent.setOnClickListener {
            val BTechStudentIntent= Intent(context, SelectBatchYearActivity::class.java)
            startActivity(BTechStudentIntent)
        }
        MtechStudent.setOnClickListener {
            val MtechStudentIntent= Intent(context, MTechStudentActivity::class.java)
            startActivity(MtechStudentIntent)
        }

        StudentCommunity.setOnClickListener {
            val StudentCommunityIntent= Intent(context, StudentCommunityActivity::class.java)
            startActivity(StudentCommunityIntent)
        }

    }
}