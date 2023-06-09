package com.example.campusconnect_aiactr.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.pojo.upcomingeventnoticeModel

class upcomingeventnoticeAdapter(val arrupcomingevent:ArrayList<upcomingeventnoticeModel>):RecyclerView.Adapter<upcomingeventnoticeAdapter.ViewHolder>() {
    class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val tvUpcomingEventnoticeTitle=itemView.findViewById<TextView>(R.id.tvUpcomingEventnoticeTitle)
        val tvUpcomingEventnoticeSharedby=itemView.findViewById<TextView>(R.id.tvUpcomingEventnoticeSharedby)
        val tvUpcomingEventnoticeDate=itemView.findViewById<TextView>(R.id.tvUpcomingEventnoticeDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.upcomingeventnotice_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
      return arrupcomingevent.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvUpcomingEventnoticeTitle.text=arrupcomingevent[position].title
        holder.tvUpcomingEventnoticeSharedby.text=arrupcomingevent[position].sharedby
        holder.tvUpcomingEventnoticeDate.text=arrupcomingevent[position].date

    }
}