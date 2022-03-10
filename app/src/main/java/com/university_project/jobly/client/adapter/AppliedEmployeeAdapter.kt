package com.university_project.jobly.client.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.university_project.jobly.R
import com.university_project.jobly.client.datamodel.AppliedEmployeeDataModel

class AppliedEmployeeAdapter() :
    RecyclerView.Adapter<AppliedEmployeeAdapter.AppliedEmployeeViewHolder>() {
    private var mlist = listOf<AppliedEmployeeDataModel>()

    class AppliedEmployeeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.tv_appliedEmployeeTitle_id)
        val btnAccept: ImageButton = itemView.findViewById(R.id.btn_appliedEmployeeAccept_id)
        val btnReject: ImageButton = itemView.findViewById(R.id.btn_appliedEmployeeReject_id)
        val btnDown: ImageButton = itemView.findViewById(R.id.btn_appliedEmployeeDown_id)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AppliedEmployeeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.applied_employee_item_view, parent, false)
        return AppliedEmployeeViewHolder(view)
    }

    override fun onBindViewHolder(holder: AppliedEmployeeViewHolder, position: Int) {

    }

    fun setData(mlist: List<AppliedEmployeeDataModel>) {
        this.mlist = mlist
    }

    override fun getItemCount(): Int {
        return mlist.size
    }
}