package com.ismailmesutmujde.kotlincountdowntimer

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlincountdowntimer.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var bindingMain : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.buttonStart.setOnClickListener {

            val counter = object : CountDownTimer(30000,1000) {
                override fun onTick(millisUntilFinished: Long) {
                    bindingMain.textViewOutput.text = "Remaining Time : ${millisUntilFinished/1000} sec"
                }

                override fun onFinish() {
                    bindingMain.textViewOutput.text = "Finished!"
                }

            }

            counter.start()

        }

    }
}