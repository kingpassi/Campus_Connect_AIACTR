package com.example.campusconnect_aiactr.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.pojo.tnpNoticeModel

class tnpnoticeAdapter(val arrtnpnotice:ArrayList<tnpNoticeModel>):RecyclerView.Adapter<tnpnoticeAdapter.ViewHolder>() {
    class ViewHolder(val itemView:View):RecyclerView.ViewHolder(itemView) {
        val tvTnpNoticeTitle=itemView.findViewById<TextView>(R.id.tvTnpNoticeTitle)
        val tvTnpNoticeSharedBy=itemView.findViewById<TextView>(R.id.tvTnpNoticeSharedBy)
        val tvTnpNoticeDate=itemView.findViewById<TextView>(R.id.tvTnpNoticeDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.tnpnotice_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrtnpnotice.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.tvTnpNoticeTitle.text=arrtnpnotice[position].title
        holder.tvTnpNoticeSharedBy.text=arrtnpnotice[position].sharedby
        holder.tvTnpNoticeDate.text=arrtnpnotice[position].date
    }
}