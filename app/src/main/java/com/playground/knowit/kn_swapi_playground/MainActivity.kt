package com.playground.knowit.kn_swapi_playground

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import src.commonMain.kotlin.createApplicationScreenMessage


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.main_text).text = createApplicationScreenMessage()
    }
}
