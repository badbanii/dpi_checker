package com.theviciousgames.dpichecker.ui.home.view

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.theviciousgames.dpichecker.R
import com.theviciousgames.dpichecker.databinding.FragmentHomeBinding
import com.theviciousgames.dpichecker.utils.Destinations

class HomeFragment:Fragment(R.layout.fragment_home) {
    private val binding by viewBinding(FragmentHomeBinding::bind)

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