package com.application.betvictorsports

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import com.dakulangsakalam.customwebview.presentation.ui.jump.JumpActivity
import com.dakulangsakalam.customwebview.presentation.ui.jump.JumpType
import kotlinx.coroutines.ExperimentalCoroutinesApi

@OptIn(ExperimentalCoroutinesApi::class)
class SplashAct : JumpActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val handler = Handler()
        handler.postDelayed({
            splashAction(JumpType.JUMP_LINK, 1) { _, _ ->
                startActivity(Intent(this, HomePage::class.java))
                finish()
            }
        }, 1500)
    }
}