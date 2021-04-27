package com.ilhomjon.codial

import android.graphics.Color
import android.os.Bundle
import android.view.*
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayout = LinearLayout(this)
        linearLayout.orientation = LinearLayout.VERTICAL
        val linerLayoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
        LinearLayout.LayoutParams.MATCH_PARENT)

        linearLayout.setBackgroundColor(Color.GREEN)

        val textView = TextView(this)
        textView.setText("Abdulboriy")

        linearLayout.addView(textView)

        setContentView(linearLayout, linerLayoutParams)
    }

}