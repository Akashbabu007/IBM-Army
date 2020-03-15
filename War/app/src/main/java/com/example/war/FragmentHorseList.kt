package com.example.war

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction


class FragmentHorseList : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val returnView = inflater.inflate(R.layout.fragment_horse_list,container,false)
        val chetakButton: Button = returnView.findViewById(R.id.chetak_horse)
        chetakButton.setOnClickListener{
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,chetakHorse())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val palomoButton: Button = returnView.findViewById(R.id.Palomo_horse)
        palomoButton.setOnClickListener{
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,palomoHorse())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val sergeantRecklessButton: Button = returnView.findViewById(R.id.sergeant_reckless_horse)
        sergeantRecklessButton.setOnClickListener{
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,sergeantRecklessHorse())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }
        return returnView
    }
}
