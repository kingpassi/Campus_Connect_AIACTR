package com.example.campusconnect_aiactr.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.pojo.eeefacultyModel

class eeefacultyAdapter(val arrEeeFaculty:ArrayList<eeefacultyModel>):RecyclerView.Adapter<eeefacultyAdapter.ViewHolder>() {
    class ViewHolder(val itemView:View):RecyclerView.ViewHolder(itemView) {
        val imgEeeFacultyProfilePhoto=itemView.findViewById<ImageView>(R.id.imgEeeFacultyProfilePhoto)
        val tvEeeFacultyName=itemView.findViewById<TextView>(R.id.tvEeeFacultyName)
        val tvEeeFacultySubject=itemView.findViewById<TextView>(R.id.tvEeeFacultySubject)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val view=LayoutInflater.from(parent.context).inflate(R.layout.eeefaculty_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrEeeFaculty.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.imgEeeFacultyProfilePhoto.setImageResource(arrEeeFaculty[position].img)
        holder.tvEeeFacultyName.text=arrEeeFaculty[position].name
        holder.tvEeeFacultySubject.text=arrEeeFaculty[position].subject

    }


}