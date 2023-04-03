package com.nk.learning.modularconceptlearning

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.findNavController

fun Fragment.getParentController() : NavController =
    requireActivity().findNavController(R.id.fcv_main)