package com.nk.learning.modularconceptlearning

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.net.toUri
import androidx.fragment.app.Fragment
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.nk.learning.modularconceptlearning.databinding.FragmentMainBinding

class MainFragment : Fragment() {
    private lateinit var binding : FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navHostFragment = childFragmentManager.findFragmentById(R.id.fcv_main) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bottomNavView.setupWithNavController(navController)
        binding.fab.setOnClickListener {
            val request= NavDeepLinkRequest.Builder.fromUri("android-app:/com.nk.learning.home/home_second".toUri()).build()
            requireActivity().findNavController(R.id.fcv_main).navigate(request)
        }
    }
}