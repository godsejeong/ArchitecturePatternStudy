package com.jjmin.studyproject.bus

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.jjmin.studyproject.R
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_rx_bus.*

class RxBusActivity : AppCompatActivity() {
    val event = RxEventBus()

    @SuppressLint("CheckResult")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rx_bus)

        rxBtn.setOnClickListener {
            var text = rxEt.text.toString()
            event.getInstance().sendEvent(text)
        }

        event.getInstance().getEvent()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe {
                Toast.makeText(this, it, Toast.LENGTH_SHORT).show()
            }
    }
}
