package com.example.war

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast



class chetakHorse : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_chetak_horse, container, false)

        val selectbutton: Button = view.findViewById(R.id.select)
        selectbutton.setOnClickListener {
            Toast.makeText(
                activity,
                "you selected chetak",
                Toast.LENGTH_LONG
            ).show()

        }
        return view
    }
}
