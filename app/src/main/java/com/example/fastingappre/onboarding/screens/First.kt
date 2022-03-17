package com.example.fastingappre.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.viewpager2.widget.ViewPager2
import com.example.fastingappre.R
import com.example.fastingappre.databinding.FragmentFirstBinding


class First : Fragment(R.layout.fragment_first) {

    private lateinit var binding: FragmentFirstBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)


        val viewPager =  activity?.findViewById<ViewPager2>(R.id.viewPager)

        binding.btnNext2.setOnClickListener {
            viewPager?.currentItem = 1
        }
    }



}

