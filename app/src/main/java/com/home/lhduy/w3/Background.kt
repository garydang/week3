package com.home.lhduy.w3

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_background.*
import kotlinx.android.synthetic.main.activity_main.*

class Background : AppCompatActivity() {

    private var  indexBackground:Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_background)


        setBackGroundKotlin.setOnClickListener{
            displayBackground.setImageResource(R.drawable.kotlin)
            indexBackground = 1
        }

        setBackGroundAngular.setOnClickListener{
            displayBackground.setImageResource(R.drawable.angular)
            indexBackground = 2
        }

        setBackGroundFlutter.setOnClickListener{
            displayBackground.setImageResource(R.drawable.flutter)
            indexBackground = 3
        }

        setBackGroundGolang.setOnClickListener{
            displayBackground.setImageResource(R.drawable.golang)
            indexBackground = 4
        }

        setBackGroundJavascript.setOnClickListener{
            displayBackground.setImageResource(R.drawable.javascript)
            indexBackground = 5
        }

        setBackGroundPython.setOnClickListener{
            displayBackground.setImageResource(R.drawable.python)
            indexBackground = 6
        }

        save.setOnClickListener {

            intent.putExtra(CURRENT_BACKGROUND,indexBackground)
            startActivity(intent)
            setResult(Activity.RESULT_OK, intent)


        }
    }
}
