package com.jjmin.studyproject


import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var test : Test

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       var component = DaggerTestComponent.builder()
            .testModule(TestModule())
            .build()

        component.inject(this)

        mainTv.text = "${test.num}"

    }
}