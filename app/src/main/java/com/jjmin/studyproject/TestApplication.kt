package com.jjmin.studyproject

import android.app.Application
import android.content.Context

class TestApplication : Application(){
    var context : Context? = null

    override fun onCreate() {
        super.onCreate()
        context = this
    }

}