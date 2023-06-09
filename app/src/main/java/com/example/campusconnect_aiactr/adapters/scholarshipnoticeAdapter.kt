package com.example.campusconnect_aiactr.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.pojo.scholarshipnoticeModel

class scholarshipnoticeAdapter(val arrsholarschipnotice:ArrayList<scholarshipnoticeModel>):RecyclerView.Adapter<scholarshipnoticeAdapter.ViewHolder>() {
    class ViewHolder(val itemView:View):RecyclerView.ViewHolder(itemView) {

        val tvScholarshipNoticeTitle=itemView.findViewById<TextView>(R.id.tvScholarshipNoticeTitle)
        val tvScholarshipNoticeSharedby=itemView.findViewById<TextView>(R.id.tvScholarshipNoticeSharedby)
        val tvScholarshipNoticeDate=itemView.findViewById<TextView>(R.id.tvScholarshipNoticeDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.scholarshipnotice_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return arrsholarschipnotice.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvScholarshipNoticeTitle.text=arrsholarschipnotice[position].title
        holder.tvScholarshipNoticeSharedby.text=arrsholarschipnotice[position].sharedby
        holder.tvScholarshipNoticeDate.text=arrsholarschipnotice[position].date

    }
}