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
import com.example.campusconnect_aiactr.pojo.tnpNoticeModel

class tnpnoticeAdapter(private val context: Context, private val arrtnpnotice: List<tnpNoticeModel>) : RecyclerView.Adapter<tnpnoticeAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.tnpnotice_row, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvTnpNoticeTitle.text = arrtnpnotice[position].title
        holder.tvTnpNoticeSharedBy.text = arrtnpnotice[position].sharedby
        holder.tvTnpNoticeDate.text = arrtnpnotice[position].date

        holder.itemView.setOnClickListener {
            val intent = Intent(context, PdfViewerActivity::class.java)
            intent.putExtra("pdfUrl", arrtnpnotice[position].pdf)
            context.startActivity(intent)
        }
    }

    override fun getItemCount(): Int {
        return arrtnpnotice.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvTnpNoticeTitle: TextView = itemView.findViewById(R.id.tvTnpNoticeTitle)
        val tvTnpNoticeSharedBy: TextView = itemView.findViewById(R.id.tvTnpNoticeSharedBy)
        val tvTnpNoticeDate: TextView = itemView.findViewById(R.id.tvTnpNoticeDate)
    }
}


