package com.theviciousgames.dpichecker.ui.home.viewmodel

import android.app.Activity
import androidx.lifecycle.ViewModel
import com.theviciousgames.dpichecker.ui.home.wm.WmUtils

class HomeViewModel:ViewModel() {
    private var wmUtils:WmUtils= WmUtils()

    fun getCurrentDensity(activity: Activity):Int
    {
        return wmUtils.getCurrentDensity(activity)
    }

    fun getCurrentXDensity (activity: Activity):Float
    {
        return wmUtils.getCurrentXDensity(activity)
    }

    fun getCurrentYDensity (activity: Activity):Float
    {
        return wmUtils.getCurrentYDensity(activity)
    }

    fun getCurrentScaledDensity (activity: Activity):Float
    {
        return wmUtils.getCurrentScaledDensity(activity)
    }
}