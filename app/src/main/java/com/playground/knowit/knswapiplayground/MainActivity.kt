package com.playground.knowit.knswapiplayground

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import src.commonMain.kotlin.createApplicationScreenMessage
import src.commonMain.kotlin.searchStarship


class MainActivity : AppCompatActivity() {

    private lateinit var starshipButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<TextView>(R.id.main_text).text = createApplicationScreenMessage()
        main_text.text = createApplicationScreenMessage()
        starshipButton = findViewById(R.id.starship_button)
        starshipButton.setOnClickListener {
            findViewById<TextView>(R.id.starship_name).text = searchStarship()
        }
    }
}
