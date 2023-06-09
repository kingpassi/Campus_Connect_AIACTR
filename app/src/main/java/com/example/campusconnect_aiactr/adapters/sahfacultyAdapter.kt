package com.example.campusconnect_aiactr.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.pojo.sahFacultyModel

class sahfacultyAdapter(arrSahFaculty:ArrayList<sahFacultyModel>):RecyclerView.Adapter<sahfacultyAdapter.ViewHolder>() {
    class ViewHolder(val itemView:View):RecyclerView.ViewHolder(itemView) {

        val imgSahFacultyProfilePhoto=itemView.findViewById<ImageView>(R.id.imgSahFacultyProfilePhoto)
        val tvSahFacultyName=itemView.findViewById<TextView>(R.id.tvSahFacultyName)
        val tvSahFacultySubject=itemView.findViewById<TextView>(R.id.tvSahFacultySubject)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.sahfaculty_row,parent,false)
       return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}