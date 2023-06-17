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
import com.example.campusconnect_aiactr.pojo.annualfeesModel

class annualfeesAdapter(private val context:Context, val arrannualfeenotice:ArrayList<annualfeesModel>):RecyclerView.Adapter<annualfeesAdapter.ViewHolder>() {
    inner class ViewHolder( itemView:View):RecyclerView.ViewHolder(itemView) {

        val tvAnnualFeesNoticeTitle=itemView.findViewById<TextView>(R.id.tvAnnualFeesNoticeTitle)
        val tvAnnualFeesNoticeSharedby=itemView.findViewById<TextView>(R.id.tvAnnualFeesNoticeSharedby)
        val tvAnnualFeesNoticeDate=itemView.findViewById<TextView>(R.id.tvAnnualFeesNoticeDate)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.annualfeenotice_row,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return arrannualfeenotice.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       holder.tvAnnualFeesNoticeTitle.text=arrannualfeenotice[position].title
       holder.tvAnnualFeesNoticeSharedby.text=arrannualfeenotice[position].sharedby
       holder.tvAnnualFeesNoticeDate.text=arrannualfeenotice[position].date

        holder.itemView.setOnClickListener {
            val intent = Intent(context, PdfViewerActivity::class.java)
            intent.putExtra("pdfUrl", arrannualfeenotice[position].pdf)
            context.startActivity(intent)
        }

    }
}