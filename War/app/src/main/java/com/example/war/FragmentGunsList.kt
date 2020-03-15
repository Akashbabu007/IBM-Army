package com.example.war

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction

class FragmentGunsList : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_guns_list,container,false)

        val m642button:Button = view.findViewById(R.id.M642_gun)
        m642button.setOnClickListener{
            val fragmenttranscation:FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,M642Gun())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val mk14button:Button = view.findViewById(R.id.MK14_gun)
        mk14button.setOnClickListener{
            val fragmenttranscation:FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,MK14Gun())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val bm4button:Button = view.findViewById(R.id.BM4_gun)
        bm4button.setOnClickListener{
            val fragmenttranscation:FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,BenelliM4_gun())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }
        return view
    }
}
