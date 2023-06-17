package com.example.campusconnect_aiactr.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.pojo.eceStudentModel

class ecestudentAdapter(val context:Context,val arrecestudent:ArrayList<eceStudentModel>):RecyclerView.Adapter<ecestudentAdapter.ViewHolder>() {
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val imgECEStudent=itemView.findViewById<ImageView>(R.id.imgECEStudent)
        val tvECEStudentName=itemView.findViewById<TextView>(R.id.tvECEStudentName)
        val tvECEStudentnumber=itemView.findViewById<TextView>(R.id.tvECEStudentnumber)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.ecestudent_row,parent,false)
       return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrecestudent.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.imgECEStudent.setImageResource(arrecestudent[position].img)
        holder.tvECEStudentName.text=arrecestudent[position].Name
        holder.tvECEStudentnumber.text=arrecestudent[position].Rollno
    }
}