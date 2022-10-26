package com.example.demo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeFragment : Fragment() {

    private lateinit var recyclerView : RecyclerView
    private lateinit var employeeList : ArrayList<Employee>
    private lateinit var employeeadapter : EmployeeAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        dataSetter()

        recyclerView=view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager= LinearLayoutManager(context)
        recyclerView.setHasFixedSize(true)

        employeeadapter=EmployeeAdapter(employeeList)
        recyclerView.adapter=employeeadapter
    }


    // Creating a method to pass the array values
    private fun dataSetter() {

        employeeList=ArrayList()

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
    }
    private fun contentShown() {


    }

}

