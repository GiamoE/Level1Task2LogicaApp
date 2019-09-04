package com.example.level1task2logicaapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.logica_activity.*

class LogicaActivity : AppCompatActivity() {

    // initializing variables
    private var trueValue: String = "T"
    private var falseValue: String = "F"
    private var highScore: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.logica_activity)
        initViews()
    }

    private fun initViews() {
        // Button on click Listener
        btnSubmit.setOnClickListener {
            onButtonClick()
        }
    }

    private fun onButtonClick() {
        if (
            etValue1.text.toString() == trueValue
            && etValue2.text.toString() == falseValue
            && etValue3.text.toString() == falseValue
            && etValue4.text.toString() == falseValue
        ) {
            onAnswerCorrect()
            highScore++
        } else {
            onAnswerWrong()
            highScore = 0
        }
        tvHighScore.text = getString(R.string.high_score) + " " + highScore
    }

    // Toast functions
    private fun onAnswerCorrect() {
        Toast.makeText(this, getString(R.string.correct), Toast.LENGTH_LONG).show()
    }

    private fun onAnswerWrong() {
        Toast.makeText(this, getString(R.string.incorrect), Toast.LENGTH_LONG).show()
    }
}
