package com.example.campusconnect_aiactr.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.pojo.cseFacultyModel

class csefacultyAdapter(val arrCseFaculty:ArrayList<cseFacultyModel>):RecyclerView.Adapter<csefacultyAdapter.ViewHolder>() {
    class ViewHolder(val itemView:View):RecyclerView.ViewHolder(itemView) {

        val imgCseFacultyProfilePhoto=itemView.findViewById<ImageView>(R.id.imgCseFacultyProfilePhoto)
        val tvCseFacultyName=itemView.findViewById<TextView>(R.id.tvCseFacultyName)
        val tvCseFacultySubject=itemView.findViewById<TextView>(R.id.tvCseFacultySubject)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.csefaculty_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return arrCseFaculty.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.imgCseFacultyProfilePhoto.setImageResource(arrCseFaculty[position].img)
        holder.tvCseFacultyName.text=arrCseFaculty[position].name
        holder.tvCseFacultySubject.text=arrCseFaculty[position].subject
    }


}