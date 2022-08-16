package com.application.betvictorsports

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.application.betvictorsports.Navigator.Companion.openPage
import kotlinx.android.synthetic.main.activity_main2.*

class MainActivity2  : AppCompatActivity(), OnContentClickListener {

    private var layoutManager: RecyclerView.LayoutManager? = null

    private val onItemClicked by lazy { this }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        initRecyclerView()
        initOnClicked()
    }
    private fun initRecyclerView() {
        layoutManager = LinearLayoutManager(this)
        recyclerView?.layoutManager = layoutManager
        recyclerView?.adapter = RecyclerAdapter(onItemClicked)
    }
    private fun initOnClicked() {
        cdView?.setOnClickListener {
            openPage(this, ContentInside::class.java)
        }
    }
    override fun OnContentItemClicked(image: Int, content: Int) {
        openPage(this, ContentInside::class.java, image, content)
    }
}
