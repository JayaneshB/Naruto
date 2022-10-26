package com.example.demo

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val NAME = "param1"
private const val SURNAME = "param2"
private const val IMG = "image"

/**
 * A simple [Fragment] subclass.
 * Use the [Fragment.newInstance] factory method to
 * create an instance of this fragment.
 */

class DescriptionFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var name: String? = null
    private var surName: String? = null
    private var img: Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            name = it.getString(NAME)
            surName = it.getString(SURNAME)
            img = it.getInt(IMG)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("data_check",name+surName)
        view.findViewById<TextView>(R.id.text).text="Welcome $name $surName"
        img?.let { view.findViewById<ImageView>(R.id.iv_image).setImageResource(it) }

    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Fragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String, image: Int) =
            DescriptionFragment().apply {
                arguments = Bundle().apply {
                    putString(NAME, param1)
                    putString(SURNAME, param2)
                    putInt(IMG,image)
                }
            }
    }

}