package com.example.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /** Using activity without using fragments
         *
         *
         *
        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager=LinearLayoutManager(this)

        employeeList= ArrayList()

        employeeList.add(Employee(R.drawable.naruto,"Naruto","Uzumaki"))
        employeeList.add(Employee(R.drawable.hinata,"Hinata","Naruto"))
        employeeList.add(Employee(R.drawable.sasuke,"Sasuke","Uchiha"))
        employeeList.add(Employee(R.drawable.madara,"Madara","Uchiha"))
        employeeList.add(Employee(R.drawable.itachi,"Itachi","Uchiha"))
        employeeList.add(Employee(R.drawable.kakshi,"Kakashi","Sensei"))
        employeeList.add(Employee(R.drawable.jiraya,"Jiraya","Sensei"))
        employeeList.add(Employee(R.drawable.tsunade,"Tsunade","Lady"))
        employeeList.add(Employee(R.drawable.minato,"Minato","Uzumaki"))
        employeeList.add(Employee(R.drawable.kushina,"kushina","Uzumaki"))

        employeeadapter=EmployeeAdapter(employeeList)
        recyclerView.adapter=employeeadapter
        */

        replaceFragment(HomeFragment())
    }

    // Replacing the main activity page with fragment to be used further

    private fun replaceFragment(homeFragment: Fragment) {

        val fragmentManager=supportFragmentManager
        val fragmentTransaction=fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout,homeFragment)
        fragmentTransaction.commit()
    }
}