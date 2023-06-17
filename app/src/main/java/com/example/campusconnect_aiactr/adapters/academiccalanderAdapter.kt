package com.example.campusconnect_aiactr.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.campusconnect_aiactr.Activitys.PdfViewerActivity
import com.example.campusconnect_aiactr.R
import com.example.campusconnect_aiactr.pojo.academiccalanderModel

class academiccalanderAdapter(private val context:Context, val arracademiccalender:ArrayList<academiccalanderModel>):RecyclerView.Adapter<academiccalanderAdapter.ViewHolder>() {
   inner class ViewHolder( itemView: View):RecyclerView.ViewHolder(itemView) {

        val tvAcademicCalanderTitle=itemView.findViewById<TextView>(R.id.tvAcademicCalanderTitle)
        val tvAcademicCalanderSharedBy=itemView.findViewById<TextView>(R.id.tvAcademicCalanderSharedBy)
        val tvAcademicCalanderDate=itemView.findViewById<TextView>(R.id.tvAcademicCalanderDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.academiccalandernotice_row,parent,false)
       return ViewHolder(view)
    }

    override fun getItemCount(): Int {
       return arracademiccalender.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.tvAcademicCalanderTitle.text=arracademiccalender[position].title
       holder.tvAcademicCalanderSharedBy.text=arracademiccalender[position].sharedby
       holder.tvAcademicCalanderDate.text=arracademiccalender[position].date

        holder.itemView.setOnClickListener {
            val intent = Intent(context, PdfViewerActivity::class.java)
            intent.putExtra("pdfUrl", arracademiccalender[position].pdf)
            context.startActivity(intent)
        }
    }


}