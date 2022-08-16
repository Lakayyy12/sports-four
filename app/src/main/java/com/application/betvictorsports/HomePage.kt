package com.application.betvictorsports

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class HomePage : AppCompatActivity() {

    private var exit = 0
    private var btn1 : TextView? = null
    private var btn2 : TextView? = null
    private var btn3 : TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        btn1 = findViewById(R.id.btn1)
        btn1?.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        btn2 = findViewById(R.id.btn2)
        btn2?.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }
        btn3 = findViewById(R.id.btn3)
        btn3?.setOnClickListener {
            val intent = Intent(this, AboutPage::class.java)
            startActivity(intent)
        }
    }
    override fun onBackPressed() {
        if (exit==0){
            exit = 1
            Toast.makeText(this,"CLICK AGAIN TO EXIT", Toast.LENGTH_SHORT).show()
        }
        else{
            super.finishAffinity()
        }
    }
}
