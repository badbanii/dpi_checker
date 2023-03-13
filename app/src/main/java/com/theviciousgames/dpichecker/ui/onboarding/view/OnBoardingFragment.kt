package com.theviciousgames.dpichecker.ui.onboarding.view

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.theviciousgames.dpichecker.R
import com.theviciousgames.dpichecker.utils.Destinations

class OnBoardingFragment : Fragment(R.layout.fragment_onboarding) {

    private fun navigateTo(destination: Destinations) {
        when (destination) {
            Destinations.Home -> {
                if (findNavController().currentDestination?.id == R.id.onBoardingFragment) {
                    findNavController().navigate(R.id.action_onBoardingFragment_to_homeFragment)
                }
            }

            Destinations.SecondOnBoarding -> {

            }

            Destinations.ThirdOnBoarding -> {

            }

            else -> {}
        }
    }
}