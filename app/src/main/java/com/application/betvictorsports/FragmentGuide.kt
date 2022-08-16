package com.application.betvictorsports

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AnimationUtils
import android.widget.Button
import com.application.betvictorsports.Navigator.Companion.openPage
import kotlinx.android.synthetic.main.fragment_guide.*


class FragmentGuide : Fragment(), View.OnClickListener {

    private var btn01 : Button? = null
    private var btn02 : Button? = null
    private var btn03 : Button? = null
    private var btn04 : Button? = null
    private var btn05 : Button? = null
    private var btn06 : Button? = null
    private var btn07 : Button? = null
    private var btn08 : Button? = null

    private var getView: View? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        // Inflate the layout for this fragmen
        getView = inflater.inflate(R.layout.fragment_guide, container, false)
        initComponents()
        initListener()
        return  getView
    }
    private fun initComponents(){
        btn01 = getView?.findViewById(R.id.bbtn1)
        btn02 = getView?.findViewById(R.id.bbtn2)
        btn03 = getView?.findViewById(R.id.bbtn3)
        btn04 = getView?.findViewById(R.id.bbtn4)
        btn05 = getView?.findViewById(R.id.bbtn5)
        btn06 = getView?.findViewById(R.id.bbtn6)
        btn07 = getView?.findViewById(R.id.bbtn7)
        btn08 = getView?.findViewById(R.id.bbtn8)

    }
    private fun initListener(){
        btn01?.setOnClickListener(this)
        btn02?.setOnClickListener(this)
        btn03?.setOnClickListener(this)
        btn04?.setOnClickListener(this)
        btn05?.setOnClickListener(this)
        btn06?.setOnClickListener(this)
        btn07?.setOnClickListener(this)
        btn08?.setOnClickListener(this)
    }
    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.bbtn1 ->{ openPage(context,
                GuidePage::class.java,
                bbtn1.text.toString(),
                "${getString(R.string.way_tit1)} ${getString(R.string.way_tit1c)} ${getString(R.string.way_tit1c2)} ${
                    getString(R.string.way_tit1c3)
                } ${getString(R.string.way_tit1c4)} ${getString(R.string.way_tit1c5)}")
                val animation = AnimationUtils.loadAnimation(context, R.anim.zoom_in)
                view.startAnimation(animation)
        }
            R.id.bbtn2 -> {
                openPage(context,
                    GuidePage::class.java,
                    bbtn2.text.toString(),
                    "${getString(R.string.way_tit2)} ${getString(R.string.way_titc1)} ${getString(R.string.way_titc2)}")
                val animation = AnimationUtils.loadAnimation(context, R.anim.zoom_in)
                view.startAnimation(animation)
            }
            R.id.bbtn3 -> {
                openPage(context,
                    GuidePage::class.java,
                    bbtn3.text.toString(),
                    "${getString(R.string.way_tit3)} ${getString(R.string.way_tit3c1)}")
                val animation = AnimationUtils.loadAnimation(context, R.anim.zoom_in)
                view.startAnimation(animation)
            }
            R.id.bbtn4 -> {
                openPage(context,
                    GuidePage::class.java,
                    bbtn4.text.toString(),
                    "${getString(R.string.way_tit4)} ${getString(R.string.way_tit4c1)}")
                val animation = AnimationUtils.loadAnimation(context, R.anim.zoom_in)
                view.startAnimation(animation)
            }
            R.id.bbtn5 ->{ openPage(context, GuidePage::class.java, bbtn5.text.toString(), "${getString(R.string.way_tit5)} ${getString(R.string.way_tit5c1)}")

                val animation = AnimationUtils.loadAnimation(context, R.anim.zoom_in)
                view.startAnimation(animation)
            }
            R.id.bbtn6 -> {
                openPage(context,
                    GuidePage::class.java,
                    bbtn6.text.toString(),
                    "${getString(R.string.way_tit6)} ${getString(R.string.way_tit6c1)}")
                val animation = AnimationUtils.loadAnimation(context, R.anim.zoom_in)
                view.startAnimation(animation)
            }
            R.id.bbtn7 -> {
                openPage(context,
                    GuidePage::class.java,
                    bbtn7.text.toString(),
                    "${getString(R.string.way_tit7)} ${getString(R.string.way_tit7c1)} ${getString(R.string.way_tit7c2)} ${
                        getString(R.string.way_tit7c3)
                    } ${getString(R.string.way_tit7c4)}")
                val animation = AnimationUtils.loadAnimation(context, R.anim.zoom_in)
                view.startAnimation(animation)
            }
            R.id.bbtn8 -> {
                openPage(context,
                    GuidePage::class.java,
                    bbtn8.text.toString(),
                    "${getString(R.string.way_tit8)} ${getString(R.string.way_tit8c1)}")
                val animation = AnimationUtils.loadAnimation(context, R.anim.zoom_in)
                view.startAnimation(animation)
            }
        }
    }
}