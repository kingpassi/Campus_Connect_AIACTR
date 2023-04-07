package com.example.campusconnect_aiactr

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


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
            val BTechStudentIntent=Intent(context,BTechStudentActivity::class.java)
            startActivity(BTechStudentIntent)
        }
        MtechStudent.setOnClickListener {
            val MtechStudentIntent=Intent(context,MTechStudentActivity::class.java)
            startActivity(MtechStudentIntent)
        }

        StudentCommunity.setOnClickListener {
            val StudentCommunityIntent=Intent(context,StudentCommunityActivity::class.java)
            startActivity(StudentCommunityIntent)
        }

    }
}