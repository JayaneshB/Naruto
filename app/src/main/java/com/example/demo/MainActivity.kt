package com.example.demo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

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