package com.nk.learning.modularconceptlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.net.toUri
import androidx.navigation.NavDeepLinkRequest
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.nk.learning.modularconceptlearning.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        setView()
    }

    private fun setView(){}
}