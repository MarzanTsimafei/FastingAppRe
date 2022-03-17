package com.example.fastingappre.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.fastingappre.R
import com.example.fastingappre.databinding.FragmentFirstOnboardBinding

const val ARG_OBJECT = "object"
class FirstOnboardFragmentFragment : Fragment(R.layout.fragment_first_onboard) {

    private lateinit var binding: FragmentFirstOnboardBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding = FragmentFirstOnboardBinding.bind(view)

        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {

            val count: Int = getInt(ARG_OBJECT)

            if(count == 1) {
                binding.imageViewFromFirstFragment.setImageResource(R.drawable.ic_delivery)
                binding.tvChange.text = getResources().getString(R.string.f1)
            } else if (count == 2) {
                binding.imageViewFromFirstFragment.setImageResource(R.drawable.ic_delivery)
                binding.tvChange.text = getResources().getString(R.string.f2)
            } else if (count == 3) {
                binding.imageViewFromFirstFragment.setImageResource(R.drawable.ic_delivery)
                binding.tvChange.text = getResources().getString(R.string.f3)
            } else if (count == 4) {
                binding.imageViewFromFirstFragment.setImageResource(R.drawable.ic_delivery)
                binding.tvChange.text = getResources().getString(R.string.f4)

            }
        }
    }
}