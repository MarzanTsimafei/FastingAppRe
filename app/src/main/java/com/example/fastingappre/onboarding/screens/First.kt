package com.example.fastingappre.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2

import com.example.fastingappre.R
import kotlinx.android.synthetic.main.fragment_first.*
import kotlinx.android.synthetic.main.fragment_first.view.*
import kotlinx.android.synthetic.main.fragment_second_screen.*
import kotlinx.android.synthetic.main.fragment_second_screen.view.*


const val ARG_OBJECT = "object"
class First : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_first, container, false)

        val viewPager =  activity?.findViewById<ViewPager2>(R.id.viewPager)


        view.btnNext2.setOnClickListener {
            viewPager?.currentItem = 1
        }

        return view
    }

}
