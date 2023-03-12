package com.theviciousgames.dpichecker.ui.onboarding.view

import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.theviciousgames.dpichecker.R
import com.theviciousgames.dpichecker.databinding.FragmentHomeBinding
import com.theviciousgames.dpichecker.databinding.FragmentOnboardingBinding
import com.theviciousgames.dpichecker.utils.Destinations

class OnBoardingFragment: Fragment(R.layout.fragment_onboarding) {
    private val binding by viewBinding(FragmentOnboardingBinding::bind)

    private fun navigateTo(destination: Destinations)
    {
        when(destination)
        {
            Destinations.Home->{
                if (findNavController().currentDestination?.id == R.id.onBoardingFragment)
                {
                    findNavController().navigate(R.id.action_onBoardingFragment_to_homeFragment)
                }
            }
            Destinations.SecondOnBoarding->{

            }
            Destinations.ThirdOnBoarding->{

            }
            else -> {}
        }
    }
}