package com.bhavita.toaststest

import android.graphics.Color
import android.os.Bundle
import android.support.v4.content.ContextCompat
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.bhavita.toasts.Toasts
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        /*
        Set up custom theme
        Toasts.set(textColor = Color.BLACK,
                   errorColor = Color.BLUE)
        */

        success.setOnClickListener {
            Toasts.s(this,getString(R.string.success_string) , Toast.LENGTH_LONG).show()
        }
        info.setOnClickListener{
            Toasts.i(this,getString(R.string.info_string),Toast.LENGTH_LONG).show()
        }
        warning.setOnClickListener {
            Toasts.w(this,getString(R.string.warning_string),Toast.LENGTH_LONG,null).show()
        }

        error.setOnClickListener {
            Toasts.e(this, getString(R.string.error_string),Toast.LENGTH_LONG).show()
        }

        custom.setOnClickListener {
            val icon= ContextCompat.getDrawable(this, R.drawable.ic_custom)
            Toasts.c(this,getString(R.string.custom_string),Toast.LENGTH_LONG,icon,backgroundColor = Color.BLUE).show()

            /*

            You can use in any order if variable = value method
            Toasts.c(
                    textColor = Color.BLUE,
                    icon = icon,
                    backgroundColor = Color.GREEN,
                    context = this,
                    duration = 1,
                    text = "well"
            ).show()*/
        }

    }

}
