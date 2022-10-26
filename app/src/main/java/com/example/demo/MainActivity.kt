package com.example.demo

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity(),EmployeeAdapter.Communicator {

    private var fragmentManager:FragmentManager?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fragmentManager=supportFragmentManager
        replaceFragment(HomeFragment())
    }

    // Replacing the main activity page with fragment to be used further

    private fun replaceFragment(homeFragment: Fragment) {

        val fragmentTransaction=fragmentManager?.beginTransaction()
        fragmentTransaction?.replace(R.id.frame_layout,homeFragment)?.addToBackStack("Description")
        fragmentTransaction?.commit()
    }
    // the fragment will be added over the home fragment and it keeps changing

    private fun addFragment(fragment: Fragment) {
        val fragmentTransaction=fragmentManager?.beginTransaction()
        fragmentTransaction?.add( R.id.frame_layout,fragment)?.addToBackStack("description")
        fragmentTransaction?.commit()
    }

    override fun onClick(employee: Employee) {
        Log.d("ONCLICK",employee.toString())

        // the fragment will be entirely replaced with the new fragment
        replaceFragment(DescriptionFragment.newInstance(employee.name,employee.surname,employee.image))

        // the fragment will be added over the home fragment and it keeps changing

//         addFragment(DescriptionFragment.newInstance(employee.name,employee.surname,employee.image))


    }
}