package com.example.mynoteapp.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.mynoteapp.R
import com.example.mynoteapp.databinding.FragmentHomeBinding
import java.util.Timer
import java.util.TimerTask

class HomeFragment : Fragment(R.layout.fragment_home) {

    private val binding by viewBinding(FragmentHomeBinding::bind)
    private var counter: Int = 0

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initialize()
    }

    private fun initialize() = with(binding) {

    }
}