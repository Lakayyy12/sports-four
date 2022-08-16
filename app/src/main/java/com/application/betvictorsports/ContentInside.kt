package com.application.betvictorsports

import android.os.Bundle
import android.text.Html
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.application.betvictorsports.R
import kotlinx.android.synthetic.main.activity_content_inside.*

class ContentInside : AppCompatActivity() {

    private var content: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_content_inside)

        content = findViewById(R.id.content)

        setContentDetails()
        back?.setOnClickListener {
            onBackClicked()
        }
    }
    private fun setContentDetails(){
        image?.setBackgroundResource(intent.getIntExtra("image", 0))
        content?.text = Html.fromHtml(resources.getString(intent.getIntExtra("content", 0)))
    }
    //Functions
    private fun onBackClicked(){
        onBackPressed()
    }
}