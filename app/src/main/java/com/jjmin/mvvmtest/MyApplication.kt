package com.jjmin.mvvmtest

import android.app.Application
import com.jjmin.mvvmtest.di.MyModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(MyModules.modules)
        }
    }
}