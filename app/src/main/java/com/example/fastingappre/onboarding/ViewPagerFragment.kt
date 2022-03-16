package com.example.fastingappre.onboarding

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fastingappre.R
import com.example.fastingappre.onboarding.adapters.ViewPagerAdapter
import com.example.fastingappre.onboarding.screens.First
import com.example.fastingappre.onboarding.screens.SecondScreen
import com.example.fastingappre.onboarding.screens.ThirdScreen
import kotlinx.android.synthetic.main.fragment_view_pager.view.*

class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

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
        view.viewPager.isUserInputEnabled = false
        view.viewPager.adapter = adapter

        return view
    }

}