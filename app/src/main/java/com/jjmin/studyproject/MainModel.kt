package com.jjmin.studyproject

class MainModel(num1 : Double,num2 : Double) {

    var num1 = num1
    var num2 = num2

    fun Add() : Double {
        return num1 + num2
    }

    fun Minus() : Double {
        return num1 - num2
    }

    fun Multiplication() : Double {
        return num1 * num2
    }

    fun Division() : Double{
        return num1 / num2
    }

}