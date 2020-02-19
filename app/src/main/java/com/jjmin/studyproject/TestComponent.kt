package com.jjmin.studyproject


import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [TestModule::class])
interface TestComponent {
    fun inject(mainActivity: MainActivity)
}