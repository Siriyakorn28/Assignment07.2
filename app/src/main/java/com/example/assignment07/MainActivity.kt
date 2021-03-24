package com.example.assignment07

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var disply = 0
    var operator = ""
    var num = 0
    var sum = 0

    @RequiresApi(Build.VERSION_CODES.R)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number = 0
        zero.setOnClickListener {
            if (show.text.toString() == "0" ||disply == 1) {
                show.setText("0")
            } else {
                var number = show.text.toString().plus(0)
                show.setText(number)
            }
        }
        one.setOnClickListener {
            if (show.text.toString() == "0"||disply == 1) {
                show.setText("1")
            } else {
                var number = show.text.toString().plus(1)
                show.setText(number)
            }
        }
        two.setOnClickListener {
            if (show.text.toString() == "0"||disply == 1) {
                show.setText("2")
            } else {
                var number = show.text.toString().plus(2)
                show.setText(number)
            }
        }
        three.setOnClickListener {
            if (show.text.toString() == "0"||disply == 1) {
                show.setText("3")
            } else {
                var number = show.text.toString().plus(3)
                show.setText(number)
            }
        }
        four.setOnClickListener {
            if (show.text.toString() == "0"||disply == 1) {
                show.setText("4")
            } else {
                var number = show.text.toString().plus(4)
                show.setText(number)
            }
        }
        five.setOnClickListener {
            if (show.text.toString() == "0"||disply == 1) {
                show.setText("5")
            } else {
                var number = show.text.toString().plus(5)
                show.setText(number)
            }
        }
        six.setOnClickListener {
            if (show.text.toString() == "0"||disply == 1) {
                show.setText("6")
            } else {
                var number = show.text.toString().plus(6)
                show.setText(number)
            }
        }
        seven.setOnClickListener {
            if (show.text.toString() == "0"||disply == 1) {
                show.setText("7")
            } else {
                var number = show.text.toString().plus(7)
                show.setText(number)
            }
        }
        eight.setOnClickListener {
            if (show.text.toString() == "0"||disply == 1) {
                show.setText("8")
            } else {
                var number = show.text.toString().plus(8)
                show.setText(number)
            }
        }
        nine.setOnClickListener {
            if (show.text.toString() == "0"||disply == 1) {
                show.setText("9")
            } else {
                var number = show.text.toString().plus(9)
                show.setText(number)
            }
        }
        btndelete.setOnClickListener {
            val text = show.text.toString()
            if (text.isNotEmpty()) {
                show.text = text.dropLast(1)
            }
        }
        btnclear.setOnClickListener() {
            show.setText("0")
        }

        btnplus.setOnClickListener() {
            disply = 1
            num = show.text.toString().toInt()
            operator = "plus"
        }
        btnminus.setOnClickListener() {
            disply = 1
            num = show.text.toString().toInt()
            operator = "minus"
        }
        btnmul.setOnClickListener() {
            disply = 1
            num = show.text.toString().toInt()
            operator = "multiply"
        }
        btndivide.setOnClickListener() {
            disply = 1
            num = show.text.toString().toInt()
            operator = "divide"
        }
        btnmod.setOnClickListener() {
            disply = 1
            num = show.text.toString().toInt()
            operator = "mod"
        }
        btnresult.setOnClickListener {
            if (operator == "plus") {
                sum = num + show.text.toString().toInt()
                show.text = sum.toString()
            } else if (operator == "minus") {
                sum = num - show.text.toString().toInt()
                show.text = sum.toString()
            } else if (operator == "multiply") {
                sum = num * show.text.toString().toInt()
                show.text = sum.toString()
            }else if (operator == "divide"){
                if (show.text.toString().toInt() == 0){
                    show.text ="error"
                }else {
                    sum = num / show.text.toString().toInt()
                    show.text = sum.toString()
                }
            }else if(operator == "mod"){
                if (show.text.toString().toInt() == 0) {
                    show.text = "error"
                }else {
                    sum = num % show.text.toString().toInt()
                    show.text = sum.toString()
                }
            }
        }
    }
}


