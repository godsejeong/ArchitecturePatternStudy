package com.jjmin.studyproject

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainView {
    var presenter = MainPresenter(this)
    var check = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


    fun onClickView(view: View) {
        when (view.id) {

            R.id.mainResultBtn -> {
                var num1 = mainEt1.text.toString()
                var num2 = mainEt2.text.toString()
                if((num1.isNotEmpty() || num2.isNotEmpty()) && check != 0) {
                    Log.e("check", check.toString())
                    presenter.ButtonSelect(num1.toDouble(), num2.toDouble(),check)
                }else if(check == 0){
                    Toast.makeText(this,"연산자를 선택해주세요",Toast.LENGTH_SHORT).show()
                }else
                    Toast.makeText(this,"연산할 숫자를 모두 입력해주세요",Toast.LENGTH_SHORT).show()
            }

            R.id.mainPlusBtn -> {
                mainOperator.text = "+"
                check = 1
            }

            R.id.mainMiunsBtn -> {
                mainOperator.text = "-"
                check = 2
            }

            R.id.mainMultipBtn -> {
                mainOperator.text = "*"
                check = 3
            }

            R.id.mainDivisionBtn -> {
                mainOperator.text = "/"
                check = 4
            }

        }
    }

    override fun ResultData(result: String) {
        mainResultTv.visibility = View.VISIBLE
        mainResultTv.text = "겷과 : $result"
    }
}
