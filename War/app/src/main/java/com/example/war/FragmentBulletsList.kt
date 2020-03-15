package com.example.war

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.FragmentTransaction


class FragmentBulletsList : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val returnView = inflater.inflate(R.layout.fragment_bullets_list, container, false)
        val bullet1Button: Button = returnView.findViewById(R.id.bullet_1)
        bullet1Button.setOnClickListener {
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container, Bullet1())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val bullet2Button: Button = returnView.findViewById(R.id.bullet_2)
        bullet2Button.setOnClickListener {
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container, Bullet2())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }

        val bullet3Button: Button = returnView.findViewById(R.id.bullet_3)
        bullet3Button.setOnClickListener {
            val fragmenttranscation: FragmentTransaction = fragmentManager!!.beginTransaction()
            fragmenttranscation.replace(R.id.container, Bullet3())
            fragmenttranscation.addToBackStack(null)
            fragmenttranscation.commit()
        }
        return returnView
    }
}
