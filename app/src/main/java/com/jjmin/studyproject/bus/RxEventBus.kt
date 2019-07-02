package com.jjmin.studyproject.bus

import io.reactivex.Observable
import io.reactivex.subjects.PublishSubject
import java.lang.Exception

class RxEventBus{
    private var rxEventBus : RxEventBus? = null
    private val subject : PublishSubject<String> = PublishSubject.create()

    fun getInstance() : RxEventBus {

        if(rxEventBus == null){
            rxEventBus = RxEventBus()
        }

        return rxEventBus!!
    }

    fun sendEvent(obj : String){
        try {
            subject.onNext(obj)
        }catch (e : Exception){
            subject.onError(e)
        }
    }

    fun getEvent() : Observable<String>{
        return subject
    }

}