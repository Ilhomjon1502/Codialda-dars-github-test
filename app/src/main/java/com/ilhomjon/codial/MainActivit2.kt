package com.ilhomjon.codial

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivit2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val linearLayout = LinearLayout(this)
        linearLayout.orientation = LinearLayout.VERTICAL
        val layoutParams = LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
        LinearLayout.LayoutParams.MATCH_PARENT)
        linearLayout.setBackgroundColor(Color.RED)
        val button = Button(this)
        button.setText(resources.getText(R.string.app_name))
        linearLayout.addView(button)
        setContentView(linearLayout, layoutParams)

        button.setOnClickListener {
            Toast.makeText(this, "Biz tuzgan button", Toast.LENGTH_SHORT).show()
        }
    }
}