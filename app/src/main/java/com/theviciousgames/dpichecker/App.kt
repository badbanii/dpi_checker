package com.theviciousgames.dpichecker

import android.app.Application
import com.fxn.stash.Stash

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Stash.init(this)
    }
}