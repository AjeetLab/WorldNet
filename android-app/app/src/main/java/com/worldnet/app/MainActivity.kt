package com.worldnet.app

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Button

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 30, 30, 30)
        layout.setBackgroundColor(Color.WHITE)

        val title = TextView(this)
        title.text = "WORLDNET"
        title.textSize = 32f
        title.setTextColor(Color.BLUE)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "Secure Global Internet Sharing"
        subtitle.textSize = 16f
        subtitle.gravity = Gravity.CENTER
        subtitle.setPadding(0, 20, 0, 30)

        val shareButton = Button(this)
        shareButton.text = "Share Internet"

        val connectButton = Button(this)
        connectButton.text = "Connect Internet"

        layout.addView(title)
        layout.addView(subtitle)
        layout.addView(shareButton)
        layout.addView(connectButton)

        setContentView(layout)
    }
}
