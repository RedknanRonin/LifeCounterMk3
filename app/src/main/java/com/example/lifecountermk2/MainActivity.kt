package com.example.lifecountermk2

import android.os.Bundle
import android.os.SystemClock
import java.util.Random
import android.view.View
import android.view.View.GONE
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*



class MainActivity : AppCompatActivity()
{

    private fun hideSystemUI()
    {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                // Set the content to appear under the system bars so that the
                // content doesn't resize when the system bars hide and show.
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        val actionBar = supportActionBar
        actionBar!!.hide()
        setContentView(R.layout.activity_main)
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        hideSystemUI()

        resetLifeTotal.setVisibility(View.GONE)
        startingPlayer.setVisibility(View.GONE)
        alempiPelaajaAloitus.setVisibility(View.GONE)
        ylempiPelaajaAloitus.setVisibility(View.GONE)

        val random = (1..2).shuffled().first()

        var p2LifeTotal= "50"
        var P1LifeTotal= "50"
        p1LifeTotalTextView.setText(P1LifeTotal)
        p2LifeTotalTextView.setText(p2LifeTotal)

        resetLifeTotal.setOnClickListener {
            p1LifeTotalTextView.setText(P1LifeTotal)
            p2LifeTotalTextView.setText(p2LifeTotal)
        }

        p1LifeAdd.setOnClickListener {
            val p1suurempiElama = (p1LifeTotalTextView.text.toString().toInt()+1)

            p1LifeTotalTextView.setText(p1suurempiElama.toString())
        }


        p1LifeLower.setOnClickListener {
            val p1pienempiElama = (p1LifeTotalTextView.text.toString().toInt()-1)

            p1LifeTotalTextView.setText(p1pienempiElama.toString())
        }

        p2LifeLower.setOnClickListener {
            val p2pienempiElama = (p2LifeTotalTextView.text.toString().toInt()-1)

            p2LifeTotalTextView.setText(p2pienempiElama.toString())
        }


        p2LifeAdd.setOnClickListener {
            val p2suurempiElama = (p2LifeTotalTextView.text.toString().toInt()+1)

            p2LifeTotalTextView.setText(p2suurempiElama.toString())
        }


        menuButton.setOnClickListener{
            if  (resetLifeTotal.visibility == View.VISIBLE)
                resetLifeTotal.setVisibility(View.GONE)
            else
                resetLifeTotal.setVisibility(View.VISIBLE)

            if (startingPlayer.visibility == View.VISIBLE)
                startingPlayer.setVisibility(View.GONE)

            else startingPlayer.setVisibility(View.VISIBLE)


            if (alempiPelaajaAloitus.visibility == View.VISIBLE)
                alempiPelaajaAloitus.setVisibility(View.GONE)

            if (ylempiPelaajaAloitus.visibility == View.VISIBLE)
                ylempiPelaajaAloitus.setVisibility(View.GONE)



        }


        fun blink1(){
        SystemClock.sleep(1000)
            alempiPelaajaAloitus.setVisibility(View.VISIBLE)
            ylempiPelaajaAloitus.setVisibility(View.VISIBLE)}
        fun blink2() {
        SystemClock.sleep(1000)
        alempiPelaajaAloitus.setVisibility(View.GONE)
        ylempiPelaajaAloitus.setVisibility(View.GONE)}

        startingPlayer.setOnClickListener {
            val random = (1..2).shuffled().first()
            if (alempiPelaajaAloitus.visibility == GONE)
                alempiPelaajaAloitus.setVisibility(View.VISIBLE)
                ylempiPelaajaAloitus.setVisibility(View.VISIBLE)
            if (ylempiPelaajaAloitus.visibility == GONE)
                alempiPelaajaAloitus.setVisibility(View.VISIBLE)
                ylempiPelaajaAloitus.setVisibility(View.VISIBLE)

            if (random == 1)
                ylempiPelaajaAloitus.setVisibility(View.GONE)

            if (random == 2)
                alempiPelaajaAloitus.setVisibility(View.GONE)
            }

      /*  startingPlayer.setOnClickListener {
            Thread.sleep(3000)
            alempiPelaajaAloitus.setVisibility(View.GONE)
            ylempiPelaajaAloitus.setVisibility(View.GONE)
        }
        startingPlayer.setOnClickListener {
            Thread.sleep(4000)
            val random = (1..2).shuffled().first()

             if (random == 1)
                 ylempiPelaajaAloitus.setVisibility(View.GONE)

             if (random == 2)
                alempiPelaajaAloitus.setVisibility(View.GONE) }*/

    }



}

//<div>Icons made by <a href="https://www.flaticon.com/authors/freepik" title="Freepik">Freepik</a> from <a href="https://www.flaticon.com/"                 title="Flaticon">www.flaticon.com</a> is licensed by <a href="http://creativecommons.org/licenses/by/3.0/"                 title="Creative Commons BY 3.0" target="_blank">CC 3.0 BY</a></div>
// on nopan linkki