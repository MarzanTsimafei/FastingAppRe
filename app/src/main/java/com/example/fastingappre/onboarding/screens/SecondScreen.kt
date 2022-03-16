package com.example.fastingappre.onboarding.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fastingappre.R
import androidx.viewpager2.widget.ViewPager2
import kotlinx.android.synthetic.main.fragment_second_screen.view.*


class SecondScreen : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_second_screen, container, false)

        val viewPager =  activity?.findViewById<ViewPager2>(R.id.viewPager)

        view.btnNext3.setOnClickListener {
            viewPager?.currentItem = 2
        }

        return view
    }

}