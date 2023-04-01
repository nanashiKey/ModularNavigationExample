package com.nk.learning.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.nk.learning.home.databinding.FragmentHomeMainBinding

class HomeMainFragment : Fragment() {
    private lateinit var binding : FragmentHomeMainBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentHomeMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.btnMove.setOnClickListener {
            Toast.makeText(requireContext(), "BTN MOVE CLICKED", Toast.LENGTH_SHORT).show()
        }
    }
}