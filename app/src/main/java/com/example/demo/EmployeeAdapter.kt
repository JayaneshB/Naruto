package com.example.demo

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter(private val EmployeeList:ArrayList<Employee>) :
    RecyclerView.Adapter<EmployeeAdapter.EmployeeViewHolder>() {

    private val tagName = EmployeeAdapter::class.java.simpleName

    class EmployeeViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

        val imageView: ImageView =itemView.findViewById(R.id.img)
        val textView01: TextView =itemView.findViewById(R.id.name)
        val textView02: TextView=itemView.findViewById(R.id.surname)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmployeeViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view_layout,parent,false)
        Log.d(tagName,"created")
        return EmployeeViewHolder(view)
    }

    override fun onBindViewHolder(holder: EmployeeViewHolder, position: Int) {

        Log.d(tagName,"binding")
        val employee=EmployeeList[position]

        holder.textView01.text = employee.name
        holder.textView02.text=employee.surname
        holder.imageView.setImageResource(employee.image)


    }

    override fun getItemCount(): Int {
        return EmployeeList.size
    }
}