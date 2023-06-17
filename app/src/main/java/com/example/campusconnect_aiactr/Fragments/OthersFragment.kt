package com.example.campusconnect_aiactr.Fragments

import android.content.Context.MODE_PRIVATE
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.findFragment
import com.example.campusconnect_aiactr.Activitys.LoginActivity
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.splashscreen.splashscreen
import org.w3c.dom.Text


class OthersFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_others, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val btnlogout=view.findViewById<Button>(R.id.btnLogOut)

        btnlogout.setOnClickListener {
            val pref = requireContext().getSharedPreferences(splashscreen.PREF_LOGIN_NAME, MODE_PRIVATE)
            val editor = pref.edit()
            editor.putBoolean("flag",false)
            editor.apply()


            val intent =Intent (context, LoginActivity::class.java)
            startActivity(intent)
        }

        /*val name=view.findViewById<TextView>(R.id.tvUserName)
        val email=view.findViewById<TextView>(R.id.tvUserEmail)
        */






    }




}