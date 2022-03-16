package com.example.fastingappre.onboarding.adapters


import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.fastingappre.onboarding.screens.ARG_OBJECT
import com.example.fastingappre.onboarding.screens.FirstOnboardFragmentFragment

class FirstFragmentAdapter(fragment: FragmentActivity) : FragmentStateAdapter(fragment) {
    override fun getItemCount(): Int = 4

    override fun createFragment(position: Int): Fragment {
        val fragment = FirstOnboardFragmentFragment()
        fragment.arguments = Bundle().apply {
            putInt(ARG_OBJECT, position + 1)
        }
        return fragment
    }

}