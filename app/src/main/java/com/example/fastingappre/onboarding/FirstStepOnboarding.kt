package com.example.fastingappre.onboarding

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.fastingappre.MainActivity
import com.example.fastingappre.R
import com.example.fastingappre.onboarding.adapters.FirstFragmentAdapter
import kotlinx.android.synthetic.main.first_step_onboardiong.*

class FirstStepOnboarding : FragmentActivity() {

    private lateinit var adapter: FirstFragmentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_step_onboardiong)

        adapter = FirstFragmentAdapter(this)

            view_pager_onb.adapter = adapter
            val intent = Intent(this, MainActivity::class.java)
        
            view_pager_onb.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                when(position){
                    0-> btnChange.text = getResources().getString(R.string.f1)
                    1->btnChange.text = getResources().getString(R.string.f2)
                    2->btnChange.text = getResources().getString(R.string.f3)
                    2-> btnChange.setOnClickListener(null) // поставить онклик на смену фрагмента
                    3->btnChange.text = getResources().getString(R.string.f4)
                    3-> btnChange.setOnClickListener {
                                startActivity(intent)
                            }
                    }
               }
        })
        }
    }
