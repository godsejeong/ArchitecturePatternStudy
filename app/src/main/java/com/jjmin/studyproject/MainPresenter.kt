package com.jjmin.studyproject

import android.util.Log

class MainPresenter(view : MainView) {
    lateinit var model : MainModel
    var view : MainView? = view

    fun ButtonSelect(num1 : Double,num2 : Double,Classify : Int) {
        model = MainModel(num1,num2)
        Log.e("Classify", Classify.toString())
        var result: Any?
        result = when(Classify){
            1-> model.Add()
            2-> model.Minus()
            3-> model.Multiplication()
            4-> model.Division()
            else -> "데이터 오류"
        }

        view?.ResultData(result.toString())
    }
}