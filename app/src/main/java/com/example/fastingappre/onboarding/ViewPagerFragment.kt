package com.example.fastingappre.onboarding

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.fastingappre.R
import com.example.fastingappre.databinding.FragmentViewPagerBinding
import com.example.fastingappre.onboarding.adapters.ViewPagerAdapter
import com.example.fastingappre.onboarding.screens.First
import com.example.fastingappre.onboarding.screens.SecondScreen
import com.example.fastingappre.onboarding.screens.ThirdScreen
import kotlinx.android.synthetic.main.fragment_view_pager.view.*

class ViewPagerFragment : Fragment(R.layout.fragment_view_pager) {

     lateinit var binding: FragmentViewPagerBinding


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentViewPagerBinding.bind(view)

        val fragmentList = arrayListOf<Fragment>(
            First(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )
        binding.viewPager.isUserInputEnabled = false
        binding.viewPager.adapter = adapter

    }


}

