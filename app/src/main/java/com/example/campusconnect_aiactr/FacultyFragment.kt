package com.example.campusconnect_aiactr

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.fragment.app.Fragment


class FacultyFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_faculty, container, false)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val director=view.findViewById<CardView>(R.id.DirectorCardView)
        val ECEFaculty=view.findViewById<CardView>(R.id.ECEFacultyCardView)
        val CSEFaculty=view.findViewById<CardView>(R.id.CSEFacultyCardView)
        val SAHFaculty=view.findViewById<CardView>(R.id.SAHFacultyCardView)
        val EEEFaculty=view.findViewById<CardView>(R.id.EEEFacultyCardView)

        director.setOnClickListener {
            val directorIntroIntent= Intent(context,DirectorIntroActivity::class.java)
            startActivity(directorIntroIntent)

        }

        ECEFaculty.setOnClickListener {
            val ECEFacultyIntent=Intent(context,ECEFacultyActivity::class.java)
            startActivity(ECEFacultyIntent)
        }

        CSEFaculty.setOnClickListener {
            val CSEFAcultyIntent=Intent(context,CSEFacultyActivity::class.java)
            startActivity(CSEFAcultyIntent)
        }

        SAHFaculty.setOnClickListener {
            val SAHFacultyIntent=Intent(context,SAHFacultyActivity::class.java)
            startActivity(SAHFacultyIntent)
        }
        EEEFaculty.setOnClickListener {
            val EEEFacultyIntent=Intent(context,EEEFacultyActivity::class.java)
            startActivity(EEEFacultyIntent)
        }


    }




}



