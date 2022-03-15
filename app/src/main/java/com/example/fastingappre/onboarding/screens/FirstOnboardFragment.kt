package com.example.fastingappre.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fastingappre.R
import android.widget.ImageView
import android.widget.TextView

class FirstOnboardFragmentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_first_onboard, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        arguments?.takeIf { it.containsKey(ARG_OBJECT) }?.apply {
            val imageView: ImageView = view.findViewById(R.id.imageViewFromFirstFragment)
            val tvChange: TextView = view.findViewById(R.id.tvChange)
            val count: Int = getInt(ARG_OBJECT)

            if(count == 1) {
                imageView.setImageResource(R.drawable.ic_delivery)
                tvChange.text = "Текст первой вкладки"
            } else if (count == 2) {
                imageView.setImageResource(R.drawable.ic_delivery)
                tvChange.text = "Текст второй вкладки"
            } else if (count == 3) {
                imageView.setImageResource(R.drawable.ic_delivery)
                tvChange.text = "Текст третьей вкладки"
            } else if (count == 4) {
                imageView.setImageResource(R.drawable.ic_delivery)
                tvChange.text = "Текст последгей вкладки"

            }
        }
    }
}