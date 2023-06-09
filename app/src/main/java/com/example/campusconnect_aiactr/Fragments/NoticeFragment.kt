package com.example.campusconnect_aiactr.Fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import com.example.campusconnect_aiactr.Activitys.*
import com.example.campusconnect_aiactr.R


class NoticeFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_notice, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val TNP=view.findViewById<CardView>(R.id.TNPCardView)
        val AcademicCalander=view.findViewById<CardView>(R.id.AcademicCalanderCardView)
        val scholarship=view.findViewById<CardView>(R.id.ScholarshipCardView)
        val UpcomingEvents=view.findViewById<CardView>(R.id.UpcomingEvents)
        val AnnualFee=view.findViewById<CardView>(R.id.AnnualFeesCardView)

        TNP.setOnClickListener {
            val TNPIntent=Intent(context, TNPActivity::class.java)
            startActivity(TNPIntent)
        }
        AcademicCalander.setOnClickListener {
            val AcademicCalanderIntent=Intent(context, AcademicCalanderActivity::class.java)
            startActivity(AcademicCalanderIntent)
        }

        scholarship.setOnClickListener {
            val ScholarshipIntent=Intent(context, ScholarshipActivity::class.java)
            startActivity(ScholarshipIntent)
        }
        UpcomingEvents.setOnClickListener {
            val UpcomingEventsIntent=Intent(context, UpcomingEventsActivity::class.java)
            startActivity(UpcomingEventsIntent)
        }
        AnnualFee.setOnClickListener {
            val AnnualFeeIntent=Intent(context, AnnualFeeActivity::class.java)
            startActivity(AnnualFeeIntent)
        }

    }
}