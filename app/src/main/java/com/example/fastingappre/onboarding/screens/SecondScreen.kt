package com.example.fastingappre.onboarding.screens

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.fastingappre.R
import androidx.viewpager2.widget.ViewPager2
import com.example.fastingappre.databinding.FragmentSecondScreenBinding


class SecondScreen : Fragment(R.layout.fragment_second_screen) {

    private lateinit var binding: FragmentSecondScreenBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondScreenBinding.bind(view)

        val viewPager =  activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.btnNext3.setOnClickListener {
            viewPager?.currentItem = 2
        }
    }
}