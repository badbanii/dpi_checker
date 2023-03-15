package com.theviciousgames.dpichecker.ui.menu.view

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.theviciousgames.dpichecker.R
import com.theviciousgames.dpichecker.databinding.FragmentMenuBinding

class MenuFragment : Fragment(R.layout.fragment_menu) {
    private val binding by viewBinding(FragmentMenuBinding::bind)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        buttonFunctions()
    }

    private fun buttonFunctions() {
        with(binding)
        {
            buttonBack.setOnClickListener {
                findNavController().navigateUp()
            }
            buttonMoreApps.setOnClickListener {
                openPlayStoreProfile()
            }
            buttonShare.setOnClickListener {
                openSharingDialog()
            }
            buttonRate.setOnClickListener {
                
            }
        }
    }

    private fun openPlayStoreProfile() {
        startActivity(
            Intent(
                Intent.ACTION_VIEW,
                Uri.parse("https://play.google.com/store/apps/dev?id=8049005269403185530")
            )
        )
    }

    private fun openSharingDialog() {
        val intent = Intent()
        intent.action = Intent.ACTION_SEND
        intent.type = "text/plain"
        intent.putExtra(
            Intent.EXTRA_TEXT,
            "Download DPI Checker:\nhttps://play.google.com/store/apps/details?id=com.theviciousgames.dpichecker"
        )
        startActivity(Intent.createChooser(intent, "Share with:"))
    }
}