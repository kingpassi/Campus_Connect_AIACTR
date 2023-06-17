package com.example.campusconnect_aiactr.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.pojo.mtechStudentModel

class mtechstudentAdapter(val context:Context, val arrMtechStudent:ArrayList<mtechStudentModel>):RecyclerView.Adapter<mtechstudentAdapter.ViewHolder>() {
    class ViewHolder(val itemView:View):RecyclerView.ViewHolder(itemView) {

        val imgMTechStudent=itemView.findViewById<ImageView>(R.id.imgMTechStudent)
        val tvMTechStudentName=itemView.findViewById<TextView>(R.id.tvMTechStudentName)
        val tvMTechStudentRollNo=itemView.findViewById<TextView>(R.id.tvMTechStudentRollNo)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val View=LayoutInflater.from(context).inflate(R.layout.mtechstudent_row,parent,false)
       return ViewHolder(View)
    }

    override fun getItemCount(): Int {
        return arrMtechStudent.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.imgMTechStudent.setImageResource(arrMtechStudent[position].img)
        holder.tvMTechStudentName.text=arrMtechStudent[position].name
        holder.tvMTechStudentRollNo.text=arrMtechStudent[position].rollno
    }
}