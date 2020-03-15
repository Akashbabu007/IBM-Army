package com.example.war

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction


class FragmentArmyMenList : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val returnView = inflater.inflate(R.layout.fragment_army_men_list, container, false)
        val bullet1Button: Button = returnView.findViewById(R.id.cavalry_Army)
        bullet1Button.setOnClickListener {
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container, cavalryArmy())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val bullet2Button: Button = returnView.findViewById(R.id.battle_Horse_Army)
        bullet2Button.setOnClickListener {
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container, battleHorseArmy())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val bullet3Button: Button = returnView.findViewById(R.id.horse_Marines_Army)
        bullet3Button.setOnClickListener {
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container, marineArmy())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }
        return returnView
    }
}
