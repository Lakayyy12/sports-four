package com.application.betvictorsports

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.ImageButton

class FragmentTip : Fragment(), View.OnClickListener {

    private var tipview: View? = null
    private var tipone: ImageButton? = null
    private var tiptwo: ImageButton? = null
    private var tipthree: ImageButton? = null
    private var tipfour: ImageButton? = null
    private var tipfive: ImageButton? = null
    private var tipsix: ImageButton? = null
    private var tipseven: ImageButton? = null
    private var tipeight: ImageButton? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragment
        tipview = inflater.inflate(R.layout.fragment_tip, container, false)
        initComponents()
        initListener()
        return tipview
    }
    private fun initComponents(){
        tipone = tipview?.findViewById(R.id.tip01)
        tiptwo = tipview?.findViewById(R.id.tip02)
        tipthree = tipview?.findViewById(R.id.tip03)
        tipfour = tipview?.findViewById(R.id.tip04)
        tipfive = tipview?.findViewById(R.id.tip05)
        tipsix = tipview?.findViewById(R.id.tip06)
        tipseven = tipview?.findViewById(R.id.tip07)
        tipeight = tipview?.findViewById(R.id.tip08)
    }
    private fun initListener(){
        tipone?.setOnClickListener(this)
        tiptwo?.setOnClickListener(this)
        tipthree?.setOnClickListener(this)
        tipfour?.setOnClickListener(this)
        tipfive?.setOnClickListener(this)
        tipsix?.setOnClickListener(this)
        tipseven?.setOnClickListener(this)
        tipeight?.setOnClickListener(this)
    }
    override fun onClick(view: View?) {
        when(view?.id){
            R.id.tip01 -> {
                Navigator.showContent(context, getString(R.string.tip1))
                val animation = AnimationUtils.loadAnimation(context, R.anim.rotate)
                view.startAnimation(animation)
            }
            R.id.tip02 ->{ Navigator.showContent(context, getString(R.string.tip2))
                val animation = AnimationUtils.loadAnimation(context, R.anim.rotate)
            view.startAnimation(animation)
        }
            R.id.tip03 ->{ Navigator.showContent(context, getString(R.string.tip3))
                val animation = AnimationUtils.loadAnimation(context, R.anim.rotate)
            view.startAnimation(animation)
        }
            R.id.tip04 ->{ Navigator.showContent(context, getString(R.string.tip4))
                val animation = AnimationUtils.loadAnimation(context, R.anim.rotate)
            view.startAnimation(animation)
        }
            R.id.tip05 ->{ Navigator.showContent(context, getString(R.string.tip5))
                val animation = AnimationUtils.loadAnimation(context, R.anim.rotate)
            view.startAnimation(animation)
        }
            R.id.tip06 ->{ Navigator.showContent(context, getString(R.string.tip6))
                val animation = AnimationUtils.loadAnimation(context, R.anim.rotate)
            view.startAnimation(animation)
        }
            R.id.tip07 ->{ Navigator.showContent(context, getString(R.string.tip7))
                val animation = AnimationUtils.loadAnimation(context, R.anim.rotate)
            view.startAnimation(animation)
        }
            R.id.tip08 ->{ Navigator.showContent(context, getString(R.string.tip8))
                val animation = AnimationUtils.loadAnimation(context, R.anim.rotate)
            view.startAnimation(animation)
        }
        }
    }
    }

