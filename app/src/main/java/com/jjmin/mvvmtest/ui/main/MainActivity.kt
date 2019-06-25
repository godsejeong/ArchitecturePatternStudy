package com.jjmin.mvvmtest.ui.main

import android.os.Bundle
import com.jjmin.mvvmtest.R
import com.jjmin.mvvmtest.databinding.ActivityMainBinding
import com.jjmin.mvvmtest.ui.base.BaseActivity
import org.koin.android.viewmodel.ext.android.viewModel
import org.koin.core.parameter.parametersOf

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val layoutResourceId: Int = R.layout.activity_main

    val useCase by lazy { MainUseCase() }
    val viewModel: MainViewModel by viewModel { parametersOf(useCase) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewDataBinding.vm = viewModel
    }
}
