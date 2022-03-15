package com.example.fastingappre

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.fastingappre.onboarding.FirstFragmentAdapter

class FirstStepOnboarding : FragmentActivity() {

    private lateinit var adapter: FirstFragmentAdapter
    private lateinit var view_pager_onb: ViewPager2
    private lateinit var btnChange: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.first_step_onboardiong)
        val intent = Intent(this, MainActivity::class.java)
        adapter = FirstFragmentAdapter(this)
        view_pager_onb = findViewById(R.id.view_pager_onb)
        btnChange = findViewById(R.id.btnChange)
        view_pager_onb.adapter = adapter

        view_pager_onb.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when(position){
                    0-> btnChange.text = "первая"
                    1->btnChange.text = "вторая"
                    2->btnChange.text = "третья"
                    3->  btnChange.setOnClickListener {
                        startActivity(intent)
                            //завершить жизненный цикл первого фрагмент активити
                    }

                }

            }
        })

        if(btnChange.text == "четвертая"){
            btnChange.text = "tttt"
        }
    }
}