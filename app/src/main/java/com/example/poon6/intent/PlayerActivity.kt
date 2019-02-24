package com.example.poon6.intent

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.player.*

class PlayerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.player)

        btn_confirm.setOnClickListener {
            nextActivity()
        }
    }


    private fun nextActivity() {
        // TODO 1
        // Create a data to be passed to the next screen

        val intent = Intent(this, DifficultyActivity::class.java)

        // TODO 2
        // Put the data into the intent

        startActivity(intent)
    }
}