package com.jjmin.mvvmtest.di

import com.jjmin.mvvmtest.ui.main.MainUseCase
import com.jjmin.mvvmtest.ui.main.MainViewModel
import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module

object MyModules {
    val modules = module {
        viewModel { (useCase : MainUseCase) ->
            MainViewModel(useCase)
        }
    }
}