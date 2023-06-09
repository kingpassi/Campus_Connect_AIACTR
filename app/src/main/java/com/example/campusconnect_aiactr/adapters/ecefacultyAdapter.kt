package com.example.campusconnect_aiactr.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.pojo.eceFacultyModel

class ecefacultyAdapter(val arrecefaculty:ArrayList<eceFacultyModel>):RecyclerView.Adapter<ecefacultyAdapter.ViewHolder>() {
    class ViewHolder(val itemView:View):RecyclerView.ViewHolder(itemView) {
        val imgEceFacultyProfilePhoto=itemView.findViewById<ImageView>(R.id.imgEceFacultyProfilePhoto)
        val tvEceFacultyName=itemView.findViewById<TextView>(R.id.tvEceFacultyName)
        val tvECEFacultySubject=itemView.findViewById<TextView>(R.id.tvECEFacultySubject)

    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.ecefaculty_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return arrecefaculty.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.imgEceFacultyProfilePhoto.setImageResource(arrecefaculty[position].img)
        holder.tvEceFacultyName.text=arrecefaculty[position].name
        holder.tvECEFacultySubject.text=arrecefaculty[position].email
    }
}