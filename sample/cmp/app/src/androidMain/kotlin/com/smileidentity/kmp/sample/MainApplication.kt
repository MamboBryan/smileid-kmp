package com.smileidentity.kmp.sample

import android.app.Application
import com.smileidentity.kmp.SmileIdentity

class MainApplication : Application() {

    override fun onCreate() {
        super.onCreate()
        initializeSmile()
    }

    private fun initializeSmile() {
        SmileIdentity.initialize(this)
    }

}