package com.application.betvictorsports

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class GuidePage : AppCompatActivity() {

    private var title: TextView? = null
    private var content: TextView? = null
    private var close: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_guide_page)

        title = findViewById(R.id.title)
        content = findViewById(R.id.content)

        title?.text = intent.getStringExtra("title")
        content?.text = intent.getStringExtra("content")

        close = findViewById(R.id.close)
        close?.setOnClickListener {
            onBackPressed()
        }
    }
}