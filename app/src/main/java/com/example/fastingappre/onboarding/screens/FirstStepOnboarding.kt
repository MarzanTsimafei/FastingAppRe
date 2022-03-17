package com.example.fastingappre.onboarding.screens

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.fastingappre.MainActivity
import com.example.fastingappre.R
import com.example.fastingappre.databinding.FirstStepOnboardiongBinding
import com.example.fastingappre.onboarding.adapters.FirstFragmentAdapter



class FirstStepOnboarding : FragmentActivity() {

    private lateinit var adapter: FirstFragmentAdapter
    private lateinit var binding : FirstStepOnboardiongBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FirstStepOnboardiongBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        adapter = FirstFragmentAdapter(this)
            binding.viewPagerOnb.adapter = adapter

            val intent = Intent(this, MainActivity::class.java)



        binding.viewPagerOnb.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                when(position){
                    0-> binding.btnChange.text = getResources().getString(R.string.f1)
                    1->binding.btnChange.text = getResources().getString(R.string.f2)
                    2->binding.btnChange.text = getResources().getString(R.string.f3)
                    3-> binding.btnChange.text = getResources().getString(R.string.f4)
                    }
                when(position){
                    0,1,2-> binding.btnChange.setOnClickListener {
                        binding.viewPagerOnb.currentItem = position+1
                    }
                    3-> binding.btnChange.setOnClickListener {
                        startActivity(intent)
                    }
                }

               }
        })
        }
    }
