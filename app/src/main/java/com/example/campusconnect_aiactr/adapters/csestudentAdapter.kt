package com.example.campusconnect_aiactr.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.pojo.cseStudentModel

class csestudentAdapter(context:Context, val arrcsestudent:ArrayList<cseStudentModel>):RecyclerView.Adapter<csestudentAdapter.ViewHolder>() {
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val imgCSEStudent=itemView.findViewById<ImageView>(R.id.imgCSEStudent)
        val tvCSEStudentName=itemView.findViewById<TextView>(R.id.tvCSEStudentName)
        val tvCSEStudentnumber=itemView.findViewById<TextView>(R.id.tvCSEStudentnumber)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.csestudent_row,parent,false)
       return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrcsestudent.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.imgCSEStudent.setImageResource(arrcsestudent[position].img)
        holder.tvCSEStudentName.text=arrcsestudent[position].Name
        holder.tvCSEStudentnumber.text=arrcsestudent[position].Rollno
    }
}