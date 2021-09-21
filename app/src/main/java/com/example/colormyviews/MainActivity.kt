package com.example.colormyviews

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import java.util.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private val rootConstraintLayout: ConstraintLayout by lazy { findViewById(R.id.constraint_layout) }
    private val boxOneText: TextView by lazy { findViewById(R.id.box_one_text) }
    private val boxTwoText: TextView by lazy { findViewById(R.id.box_two_text) }
    private val boxThreeText: TextView by lazy { findViewById(R.id.box_three_text) }
    private val boxFourText: TextView by lazy { findViewById(R.id.box_four_text) }
    private val boxFiveText: TextView by lazy { findViewById(R.id.box_five_text) }
    private val boxSixText: TextView by lazy { findViewById(R.id.box_six_text) }
    private val boxSevenText: TextView by lazy { findViewById(R.id.box_seven_text) }
    private val boxEightText: TextView by lazy { findViewById(R.id.box_eight_text) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }

    private fun setListeners() {
        val clickableViews: List<View> =
            listOf(rootConstraintLayout, boxOneText, boxTwoText, boxThreeText,boxFourText, boxFiveText, boxSixText, boxSevenText, boxEightText)

        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }

    private fun makeColored(view: View) {
        val color = if (view == rootConstraintLayout) Color.LTGRAY else getRandomColor()
        return view.setBackgroundColor(color)
    }

    private fun getRandomColor(): Int {
        val rnd = Random
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }
}