package com.home.lhduy.w3

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.service.quicksettings.Tile
import android.view.View
import com.home.lhduy.w3.R.id.title1
import kotlinx.android.synthetic.main.activity_main.*
const val BACKGROUND_CONTACT_REQUEST = 1
const val TITLE_CONTACT_REQUEST = 2
const val CURRENT_BACKGROUND = "current_background"
const val CURRENT_TITLE_COLOR = "current_title_color"
const val TEXT_CURRENT_TITLE = "text_current_title"

class MainActivity : AppCompatActivity() {

    private var  indexCurrentBackground:Int = 1
    private var  indexCurrentTitleColor:Int = 1
    private var  textCurrentTitle:String = "TEAM9"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //var data = intent.extras


        btnChangeBackground.setOnClickListener{
            val intent = Intent(this, Background::class.java)
            intent.putExtra(CURRENT_BACKGROUND, indexCurrentBackground)
            startActivityForResult(intent, BACKGROUND_CONTACT_REQUEST)
        }
        btnChangeTitle.setOnClickListener{
            val intent = Intent (this, Title::class.java )
            intent.putExtra(TEXT_CURRENT_TITLE, textCurrentTitle)
            intent.putExtra(CURRENT_TITLE_COLOR, indexCurrentTitleColor)
            startActivityForResult(intent, TITLE_CONTACT_REQUEST)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode == BACKGROUND_CONTACT_REQUEST && resultCode == Activity.RESULT_OK) {
            indexCurrentBackground = data?.getIntExtra(CURRENT_BACKGROUND, 1)!!

            when (indexCurrentBackground) {
                1 -> background.setImageResource(R.drawable.kotlin)
                2 -> background.setImageResource(R.drawable.angular)
                3 -> background.setImageResource(R.drawable.flutter)
                4 -> background.setImageResource(R.drawable.golang)
                5 -> background.setImageResource(R.drawable.javascript)
                6 -> background.setImageResource(R.drawable.python)
            }
        }

        if (requestCode == TITLE_CONTACT_REQUEST && resultCode == Activity.RESULT_OK) {
            indexCurrentTitleColor = data?.getIntExtra(CURRENT_TITLE_COLOR, 1)!!
            textCurrentTitle = data?.getStringExtra(TEXT_CURRENT_TITLE)
            title1.setText(textCurrentTitle)
            when(indexCurrentTitleColor){
                1 -> title1.setTextColor(Color.parseColor("#E91E63"))
                2 -> title1.setTextColor(Color.parseColor("#9C27B0"))
                3 -> title1.setTextColor(Color.parseColor("#3F51B5"))
                4 -> title1.setTextColor(Color.parseColor("#2196F3"))
                5 -> title1.setTextColor(Color.parseColor("#4CAF50"))
                6 -> title1.setTextColor(Color.parseColor("#D4E157"))
            }
        }

    }
}
