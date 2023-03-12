package com.theviciousgames.dpichecker.ui.home.view

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.theviciousgames.dpichecker.R
import com.theviciousgames.dpichecker.databinding.FragmentHomeBinding
import com.theviciousgames.dpichecker.ui.home.viewmodel.HomeViewModel
import com.theviciousgames.dpichecker.utils.Destinations

class HomeFragment:Fragment(R.layout.fragment_home) {
    private val binding by viewBinding(FragmentHomeBinding::bind)
    private val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        getCurrentDensity()
        getCurrentXDensity()
        getCurrentYDensity()
        getCurrentScaledDensity()
    }

    private fun getCurrentDensity()
    {
        Log.d("debug", viewModel.getCurrentDensity(requireActivity()).toString())
    }

    private fun getCurrentXDensity()
    {
        Log.d("debug", viewModel.getCurrentXDensity(requireActivity()).toString())
    }

    private fun getCurrentYDensity()
    {
        Log.d("debug", viewModel.getCurrentYDensity(requireActivity()).toString())
    }

    private fun getCurrentScaledDensity()
    {
        Log.d("debug", viewModel.getCurrentScaledDensity(requireActivity()).toString())
    }

    private fun navigateTo(destination: Destinations)
    {
        when(destination)
        {
            Destinations.Menu->{
                if (findNavController().currentDestination?.id == R.id.homeFragment)
                {
                    findNavController().navigate(R.id.action_homeFragment_to_menuFragment)
                }
            }
            else -> {}
        }
    }
}