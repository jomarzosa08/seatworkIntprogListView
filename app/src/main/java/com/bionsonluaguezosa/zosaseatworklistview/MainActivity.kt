package com.bionsonluaguezosa.zosaseatworklistview

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.widget.ListView
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val employeeListView = findViewById<ListView>(R.id.employee_list_view)

        // Sample list of employees
        val employees = listOf(
            Employee("Jomar Zosa", "001", "Online", R.drawable.employee1),
            Employee("Timothy Bionson", "002", "Offline", R.drawable.employee2),
            Employee("Abigail Estellore", "003", "Online", R.drawable.employee3),
            Employee("Emmanuel Luague", "004", "Offline", R.drawable.employee4),
            Employee("Andrea Lopez", "005", "Online", R.drawable.employee5),
            Employee("Ruffa Mendoza", "006", "Offline", R.drawable.employee6),
            Employee("ReyJean Lumapac", "007", "Online", R.drawable.employee7),
            Employee("Adelyn Gipgano", "008", "Offline", R.drawable.employee8),
            Employee("Mira Panginahog", "009", "Online", R.drawable.employee9),
            Employee("Wilson Novabos", "010", "Offline", R.drawable.employee10),
            Employee("Kim Cormanes", "011", "Online", R.drawable.employee11),
            Employee("Jessa Guillemer", "012", "Offline", R.drawable.employee12),
            Employee("Jeff Valencia", "013", "Online", R.drawable.employee13),
            Employee("Patrick Calipay", "014", "Offline", R.drawable.employee14),
            Employee("Jethro Limpag", "015", "Online", R.drawable.employee15),
            Employee("Princess Leyson", "016", "Offline", R.drawable.employee16),
            Employee("Eon Seth", "017", "Online", R.drawable.employee17),
            Employee("Jule Mortalla", "018", "Offline", R.drawable.employee18),
            Employee("Bowen Suico", "019", "Online", R.drawable.employee19),
            Employee("Honey Seno", "020", "Offline", R.drawable.employee20),
            // Add more employees here
        )

        val adapter = EmployeeAdapter(this, employees)
        employeeListView.adapter = adapter


    }
}