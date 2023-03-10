package com.theviciousgames.dpichecker.ui.home.wm

import android.app.Activity
import android.os.Build
import android.util.DisplayMetrics
import android.view.Display
import android.view.WindowManager
import android.view.WindowMetrics
import androidx.annotation.RequiresApi

class WmUtils {
    private lateinit var modes:Array<Display.Mode>

    private var dpi=0
    private var xdpi=0.0
    private var ydpi=0
    private var metrics=DisplayMetrics()
    fun getCurrentDpi(activity: Activity):Int{
        activity.windowManager.defaultDisplay.getMetrics(metrics)
        return metrics.densityDpi
    }

    fun getCurrentXdpi(activity: Activity):Float{
        activity.windowManager.defaultDisplay.getMetrics(metrics)
        return metrics.xdpi
    }

    fun getCurrentYdpi(activity: Activity):Float{
        activity.windowManager.defaultDisplay.getMetrics(metrics)
        return metrics.ydpi
    }

    fun getCurrentFloatDensity(activity: Activity):Float{
        activity.windowManager.defaultDisplay.getMetrics(metrics)
        return metrics.density
    }

    fun getCurrentScaledDensity(activity: Activity):Float{
        activity.windowManager.defaultDisplay.getMetrics(metrics)
        return metrics.scaledDensity
    }
    ///
}