package com.theviciousgames.dpichecker.ui.onboarding.view

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.fxn.stash.Stash
import com.theviciousgames.dpichecker.R
import com.theviciousgames.dpichecker.databinding.FragmentOnboardingBinding
import com.theviciousgames.dpichecker.utils.Constants
import com.theviciousgames.dpichecker.utils.Destinations

class OnBoardingFragment : Fragment(R.layout.fragment_onboarding) {
    private val binding by viewBinding(FragmentOnboardingBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        checkIfUserIsNew()
        buttonFunctions()
    }

    private fun buttonFunctions() {
        with(binding)
        {
            buttonNext.setOnClickListener {
                navigateTo(Destinations.Home)
                setUserIsNew()
            }
        }
    }

    private fun checkIfUserIsNew() {
        if (!Stash.getBoolean(Constants.USER_IS_NEW, true)) {
            navigateTo(Destinations.Home)
        }
    }

    private fun setUserIsNew() {
        Stash.put(Constants.USER_IS_NEW, false)
    }

    private fun navigateTo(destination: Destinations) {
        when (destination) {
            Destinations.Home -> {
                if (findNavController().currentDestination?.id == R.id.onBoardingFragment) {
                    findNavController().navigate(R.id.action_onBoardingFragment_to_homeFragment)
                }
            }

            else -> {}
        }
    }
}