package com.example.war

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.FragmentTransaction

class FragmentButtons : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_buttons,container,false)

        val gunbutton:Button = view.findViewById(R.id.Select_Guns_id)
        gunbutton.setOnClickListener{
            val fragmenttranscation:FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,FragmentGunsList())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val bulletbutton:Button = view.findViewById(R.id.Select_Bullets_id)
        bulletbutton.setOnClickListener{
            val fragmenttranscation:FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,FragmentBulletsList())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val horsebutton:Button = view.findViewById(R.id.Select_Horse_id)
        horsebutton.setOnClickListener{
            val fragmenttranscation:FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,FragmentHorseList())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val armymenbutton:Button = view.findViewById(R.id.Select_Army_Men_id)
        armymenbutton.setOnClickListener{
            val fragmenttranscation:FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container,FragmentArmyMenList())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val callforwarbutton:Button = view.findViewById(R.id.Select_call_for_war_id)
        callforwarbutton.setOnClickListener {
            Toast.makeText(activity,"Call for war is clicked...So its holiday Ballee Ballee",Toast.LENGTH_LONG).show()
        }

        return view
    }
}
