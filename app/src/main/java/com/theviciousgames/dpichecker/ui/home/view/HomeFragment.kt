package com.theviciousgames.dpichecker.ui.home.view

import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.theviciousgames.dpichecker.R
import com.theviciousgames.dpichecker.databinding.FragmentHomeBinding
import com.theviciousgames.dpichecker.ui.home.viewmodel.HomeViewModel
import com.theviciousgames.dpichecker.utils.Destinations

class HomeFragment : Fragment(R.layout.fragment_home) {
    private val binding by viewBinding(FragmentHomeBinding::bind)
    private val viewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        updateUi()
        buttonFunctions()
        super.onViewCreated(view, savedInstanceState)
    }

    private fun openStore(appPackage: String) {
        try {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=$appPackage")
                )
            )
        } catch (e: ActivityNotFoundException) {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse("https://play.google.com/store/apps/details?id=$appPackage")
                )
            )
        }
    }

    private fun buttonFunctions() {
        with(binding)
        {
            buttonChangeResolution.setOnClickListener {
                openStore("com.theviciousgames.resolutionchanger")
            }
            buttonChangeDpi.setOnClickListener {
                openStore("com.theviciousgames.dpimodifier")
            }
            buttonMenu.setOnClickListener {
                navigateTo(Destinations.Menu)
            }
        }
    }

    private fun updateUi() {
        binding.textviewValueDensity.text = getCurrentDensity().toString()
        binding.textviewValueScaledDensity.text = getCurrentScaledDensity().toInt().toString()
        binding.textviewValueXDensity.text = getCurrentXDensity().toInt().toString()
        binding.textviewValueYDensity.text = getCurrentYDensity().toInt().toString()
    }

    private fun getCurrentDensity(): Int {
        return viewModel.getCurrentDensity(requireActivity())
    }

    private fun getCurrentXDensity(): Float {
        return viewModel.getCurrentXDensity(requireActivity())
    }

    private fun getCurrentYDensity(): Float {
        return viewModel.getCurrentYDensity(requireActivity())
    }

    private fun getCurrentScaledDensity(): Float {
        return viewModel.getCurrentScaledDensity(requireActivity())
    }

    private fun navigateTo(destination: Destinations) {
        when (destination) {
            Destinations.Menu -> {
                if (findNavController().currentDestination?.id == R.id.homeFragment) {
                    findNavController().navigate(R.id.action_homeFragment_to_menuFragment)
                }
            }

            else -> {}
        }
    }
}