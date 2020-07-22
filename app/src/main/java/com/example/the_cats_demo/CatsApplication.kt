package com.example.the_cats_demo

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class CatsApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Adding Koin modules to our application
        startKoin {
            androidContext(this@CatsApplication)
            modules(appModules)
        }
    }
}