package com.nk.learning.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.nk.learning.home.databinding.FragmentHomeSecondPageBinding

class HomeSecondFragment : Fragment() {
    private lateinit var binding : FragmentHomeSecondPageBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeSecondPageBinding.inflate(inflater, container, false)
        return binding.root
    }
}