package com.bionsonluaguezosa.zosaseatworklistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class ProjectAdapter(private val context: Context, private val projects: List<Project>) : BaseAdapter() {

    override fun getCount(): Int {
        return projects.size
    }

    override fun getItem(position: Int): Any {
        return projects[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView = convertView
        val holder: ViewHolder

        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.project_item, parent, false)
            holder = ViewHolder()
            holder.projectNameTextView = itemView.findViewById(R.id.project_name_text_view)
            holder.projectStatusTextView = itemView.findViewById(R.id.project_status_text_view)
            itemView.tag = holder
        } else {
            holder = itemView.tag as ViewHolder
        }

        val currentProject = projects[position]
        holder.projectNameTextView.text = currentProject.name
        holder.projectStatusTextView.text = currentProject.status

        return itemView!!
    }

    private class ViewHolder {
        lateinit var projectNameTextView: TextView
        lateinit var projectStatusTextView: TextView
    }
}

