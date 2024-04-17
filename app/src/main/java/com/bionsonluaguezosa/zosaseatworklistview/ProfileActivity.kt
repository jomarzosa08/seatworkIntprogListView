package com.bionsonluaguezosa.zosaseatworklistview

import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        // Get the employee information passed from MainActivity
        val employee: Employee = intent.getParcelableExtra("employee")!!

        // Display the employee information
        val imageView = findViewById<ImageView>(R.id.employee_image_profile)
        imageView.setImageResource(employee.imageResId)
        val numberTextView = findViewById<TextView>(R.id.employee_number_profile)
        numberTextView.text = employee.number
        val nameTextView = findViewById<TextView>(R.id.employee_name_profile)
        nameTextView.text = employee.name
        val statusTextView = findViewById<TextView>(R.id.employee_status_profile)
        statusTextView.text = employee.status

        // Sample list of projects (replace this with your actual data)
        val projects = listOf(
            Project("Project Alpha", "Completed"),
            Project("Project Bravo", "In Progress"),
            Project("Project Charlie", "Not Started"),
            Project("Project Delta", "Completed"),
            Project("Project Echo", "In Progress"),
            Project("Project Foxtrot", "Not Started"),
            Project("Project Golf", "Completed"),
            Project("Project Hotel", "In Progress"),
            Project("Project India", "Not Started"),
            Project("Project Juliett", "Completed"),
            Project("Project Kilo", "In Progress"),
            Project("Project Lima", "Not Started"),
            Project("Project Mike", "Completed"),
            Project("Project November", "In Progress"),
            Project("Project Oscar", "Not Started"),
            Project("Project Papa", "In Progress"),
            Project("Project Quebec", "Not Started"),
            Project("Project Romeo", "Completed"),
            Project("Project Sierra", "In Progress"),
            Project("Project Tango", "Not Started"),
        )

        // Set up ListView and adapter
        val listView = findViewById<ListView>(R.id.projects_list_view)
        val adapter = ProjectAdapter(this, projects)
        listView.adapter = adapter
    }
}

