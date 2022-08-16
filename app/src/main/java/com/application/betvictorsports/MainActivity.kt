package com.application.betvictorsports

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.application.adapters.ViewPagerAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity(), View.OnClickListener {


    private var fab: FloatingActionButton? = null
    private var tabLayout: TabLayout? = null
    private var viewPager2: ViewPager2? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
        initListener()
    }

    private fun initComponents(){

        tabLayout = findViewById(R.id.tab_layout)
        viewPager2 = findViewById(R.id.view_pager_2)

        val adapter = ViewPagerAdapter(supportFragmentManager,lifecycle)
        viewPager2?.adapter = adapter
    }

    private fun initListener(){
        fab?.setOnClickListener(this)

        TabLayoutMediator(tabLayout!!, viewPager2!!){ tab,position->
            when(position){
                0-> tab.text="SPORTS GUIDE"
                1-> tab.text = "TIPS"
                2-> tab.text="WAYS"
            }
        }.attach()
    }
    override fun onClick(p0: View?) {
        TODO("Not yet implemented")
    }
}
