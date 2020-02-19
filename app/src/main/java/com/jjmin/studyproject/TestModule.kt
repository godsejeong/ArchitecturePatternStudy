package com.jjmin.studyproject

import android.content.Context
import dagger.Component
import dagger.Module
import dagger.Provides


@Module
class TestModule {


    @Provides
    fun provideTest(): Test {
        return Test()
    }
}
