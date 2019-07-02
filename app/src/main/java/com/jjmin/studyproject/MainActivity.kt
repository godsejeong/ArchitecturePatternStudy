package com.jjmin.studyproject

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jjmin.studyproject.bus.RxBusActivity
import com.jjmin.studyproject.search.SearchActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainBus.setOnClickListener {
            var intnet = Intent(this, RxBusActivity::class.java)
            startActivity(intnet)
        }

        mainSearch.setOnClickListener {
            var intnet = Intent(this, SearchActivity::class.java)
            startActivity(intnet)
        }

    }
}
