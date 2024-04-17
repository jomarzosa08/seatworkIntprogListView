package com.bionsonluaguezosa.zosaseatworklistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import android.content.Intent

class EmployeeAdapter(context: Context, employees: List<Employee>) :
    ArrayAdapter<Employee>(context, 0, employees) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.employee_item, parent, false)
        }

        val currentEmployee = getItem(position)

        val employeeImage = itemView?.findViewById<ImageView>(R.id.employee_image)
        val employeeNumber = itemView?.findViewById<TextView>(R.id.employee_number)
        val employeeName = itemView?.findViewById<TextView>(R.id.employee_name)
        val employeeStatus = itemView?.findViewById<TextView>(R.id.employee_status)
        val statusIndicator = itemView?.findViewById<View>(R.id.status_indicator)

        currentEmployee?.let {
            employeeImage?.setImageResource(it.imageResId)
            employeeNumber?.text = it.number
            employeeName?.text = it.name
            employeeStatus?.text = it.status

            // Set text color based on status
            if (it.status.equals("Online", ignoreCase = true)) {
                employeeStatus?.setTextColor(context.resources.getColor(R.color.green))
                statusIndicator?.setBackgroundResource(R.drawable.green_circle)
            } else {
                employeeStatus?.setTextColor(context.resources.getColor(R.color.red))
                statusIndicator?.setBackgroundResource(R.drawable.red_circle)
            }
        }

        itemView?.setOnClickListener {
            val intent = Intent(context, ProfileActivity::class.java)
            intent.putExtra("employee", currentEmployee)
            context.startActivity(intent)
        }

        return itemView!!
    }
}
