package com.application.betvictorsports

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.application.betvictorsports.R

class AboutPage : AppCompatActivity() {

    private var btn00 : Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_page)

        btn00 = findViewById(R.id.btn00)
        btn00?.setOnClickListener {
            onBackPressed()
        }
    }
}