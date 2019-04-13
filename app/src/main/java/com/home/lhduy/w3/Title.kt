package com.home.lhduy.w3

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_background.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_title.*

class Title : AppCompatActivity() {
    private var textTitle :String? = null
    private var textTitleColor :Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_title)

        var displayColor = findViewById<ImageView>(R.id.displayColor)
        var setPink = findViewById<Button>(R.id.setPink)
        var setPurple = findViewById<Button>(R.id.setPurple)
        var setIndigo = findViewById<Button>(R.id.setIndigo)
        var setLightBlue = findViewById<Button>(R.id.setLightblue)
        var setTeal = findViewById<Button>(R.id.setTeal)
        var setGreen = findViewById<Button>(R.id.setGreen)
        var editText = findViewById<EditText>(R.id.edit_text1)
        var Save = findViewById<Button>(R.id.save)
        var indexColor = 1;



        setPink.setOnClickListener {
            displayColor.setBackgroundColor(Color.parseColor("#E91E63"))
            editText.setTextColor(Color.parseColor("#E91E63"))
            indexColor =1
        }
            setPurple.setOnClickListener{
            displayColor.setBackgroundColor(Color.parseColor("#9C27B0"))
            editText.setTextColor(Color.parseColor("#9C27B0"))
                indexColor =2
        }

            setIndigo.setOnClickListener{
            displayColor.setBackgroundColor(Color.parseColor("#3F51B5"))
            editText.setTextColor(Color.parseColor("#3F51B5"))
                indexColor =3
        }

            setLightBlue.setOnClickListener{
            displayColor.setBackgroundColor(Color.parseColor("#2196F3"))
            editText.setTextColor(Color.parseColor("#2196F3"))
                indexColor =4
        }

            setTeal.setOnClickListener{
            displayColor.setBackgroundColor(Color.parseColor("#4CAF50"))
            editText.setTextColor(Color.parseColor("#4CAF50"))
                indexColor =5
        }

            setGreen.setOnClickListener{
            displayColor.setBackgroundColor(Color.parseColor("#D4E157"))
            editText.setTextColor(Color.parseColor("#D4E157"))
                indexColor =6
        }

        Save.setOnClickListener {
            var text = editText.getText().toString()
            intent.putExtra(CURRENT_TITLE_COLOR, indexColor)
            intent.putExtra(TEXT_CURRENT_TITLE, text)
            startActivity(intent)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}
