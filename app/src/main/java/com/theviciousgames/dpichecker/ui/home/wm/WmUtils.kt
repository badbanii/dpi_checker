package com.theviciousgames.dpichecker.ui.home.wm

import android.app.Activity
import android.util.DisplayMetrics

class WmUtils {
    private var metrics=DisplayMetrics()

    fun getCurrentDensity(activity: Activity):Int{
        activity.windowManager.defaultDisplay.getMetrics(metrics)
        return metrics.densityDpi
    }

    fun getCurrentXDensity(activity: Activity):Float{
        activity.windowManager.defaultDisplay.getMetrics(metrics)
        return metrics.xdpi
    }

    fun getCurrentYDensity(activity: Activity):Float{
        activity.windowManager.defaultDisplay.getMetrics(metrics)
        return metrics.ydpi
    }

    fun getCurrentScaledDensity(activity: Activity):Float{
        activity.windowManager.defaultDisplay.getMetrics(metrics)
        return metrics.scaledDensity
    }
}