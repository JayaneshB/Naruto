  package com.example.demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.LinearLayoutManager

  class MainActivity : AppCompatActivity() {
      private lateinit var recyclerView : RecyclerView
      private lateinit var employeeList : ArrayList<Employee>
      private lateinit var employeeadapter : EmployeeAdapter

      override fun onCreate(savedInstanceState: Bundle?) {
          super.onCreate(savedInstanceState)
          setContentView(R.layout.activity_main)

          recyclerView=findViewById(R.id.recyclerView)
          recyclerView.setHasFixedSize(true)
          recyclerView.layoutManager=LinearLayoutManager(this)

          employeeList= ArrayList()

          employeeList.add(Employee(R.drawable.naruto,"Naruto","Uzumaki"))
          employeeList.add(Employee(R.drawable.bakuyu_hinata,"Hinata","Naruto"))
          employeeList.add(Employee(R.drawable.uchiha_sasuke,"Sasuke","Uchiha"))
          employeeList.add(Employee(R.drawable.uchiha_madara,"Madara","Uchiha"))
          employeeList.add(Employee(R.drawable.uchiha_itachi,"Itachi","Uchiha"))
          employeeList.add(Employee(R.drawable.hatake_kakashi,"Kakashi","Sensei"))
          employeeList.add(Employee(R.drawable.sensei_jiraya,"Jiraya","Sensei"))
          employeeList.add(Employee(R.drawable.lady_tsunade,"Tsunade","Lady"))
          employeeList.add(Employee(R.drawable.minato,"Minato","Uzumaki"))
          employeeList.add(Employee(R.drawable.uzumaki_kushina,"kushina","Uzumaki"))

          employeeadapter=EmployeeAdapter(employeeList)
          recyclerView.adapter=employeeadapter

      }
}