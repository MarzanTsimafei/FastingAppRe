package com.example.fastingappre.onboarding.screens

import android.content.Context
import android.os.Binder
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fastingappre.R
import com.example.fastingappre.databinding.FragmentThirdScreenBinding


class ThirdScreen : Fragment(R.layout.fragment_third_screen) {

   private lateinit var binding: FragmentThirdScreenBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentThirdScreenBinding.bind(view)
    }
}