package com.bhavita.toasts

import android.content.Context
import android.graphics.Color
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.support.annotation.CheckResult
import android.support.annotation.ColorInt
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


//Using Object to have a singleton class
object Toasts {
    //Toasts.success

    @ColorInt
    private var TEXT_COLOR = Color.WHITE
    @ColorInt
    private var COLOR = Color.parseColor("#80606060")
    @ColorInt
    private var SUCCESS_COLOR = Color.parseColor("#06b200")
    @ColorInt
    private var ERROR_COLOR = Color.RED
    @ColorInt
    private var INFO_COLOR = Color.MAGENTA
    @ColorInt
    private var WARNING_COLOR = Color.RED

    //Configuration for Custom Theme

    fun set(textColor : Int = TEXT_COLOR,defaultColor :Int = COLOR,successColor: Int= SUCCESS_COLOR, errorColor: Int = ERROR_COLOR,
            infoColor: Int = INFO_COLOR,  warningColor: Int = WARNING_COLOR) {
        TEXT_COLOR =textColor
        COLOR=defaultColor
        SUCCESS_COLOR =successColor
        ERROR_COLOR =errorColor
        INFO_COLOR =infoColor
        WARNING_COLOR =warningColor
    }


    //Toasts.success
    fun s(context: Context, text: CharSequence, duration: Int, icon: Drawable?=Utils.getDrawable(context,R.drawable.ic_success)
          , textColor: Int= TEXT_COLOR,tintIcon : Boolean=true): Toast {
        return maketoast(context, text, icon,textColor, SUCCESS_COLOR, tintIcon, duration)
    }

    //Toasts.error
    fun e(context: Context, text: CharSequence, duration: Int, icon: Drawable?=Utils.getDrawable(context,R.drawable.ic_error),
          textColor: Int= TEXT_COLOR,tintIcon : Boolean=true): Toast {
        return maketoast(context, text, icon,textColor, ERROR_COLOR, tintIcon, duration)
    }

    //Toasts.warning
    fun w(context: Context, text: CharSequence, duration: Int, icon: Drawable?=Utils.getDrawable(context,R.drawable.ic_warning),
          textColor: Int= TEXT_COLOR,tintIcon : Boolean=true): Toast {
        return maketoast(context, text, icon,textColor, WARNING_COLOR, tintIcon, duration)
    }

    //Toasts.info
    fun i(context: Context, text: CharSequence, duration: Int, icon: Drawable?=Utils.getDrawable(context,R.drawable.ic_info),
          textColor: Int= TEXT_COLOR,tintIcon : Boolean=true): Toast {
        return maketoast(context, text, icon,textColor, INFO_COLOR, tintIcon, duration)
    }

    //Default custom Toasts.custom
    fun c(context: Context, text: CharSequence, duration: Int, icon: Drawable?=null,
          textColor: Int= TEXT_COLOR, backgroundColor : Int = COLOR, tintIcon : Boolean=false): Toast {
        return maketoast(context, text, icon,textColor,backgroundColor, tintIcon, duration)
    }


    @CheckResult
    fun maketoast(context: Context, message: CharSequence, icon: Drawable?,@ColorInt textColor: Int,
                  @ColorInt tintColor: Int,colorIcon:Boolean, duration: Int): Toast {
        val currentToast = Toast(context)
        val toastLayout = (context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater)
                .inflate(R.layout.layout_toast, null)
        val toastIcon = toastLayout.findViewById(R.id.toasts_icon) as ImageView
        val toastTextView = toastLayout.findViewById(R.id.toasts_text) as TextView
        toastTextView.text = message
        toastTextView.setTextColor(textColor)
        toastLayout.background.setColorFilter(tintColor,PorterDuff.Mode.SRC_IN)

        if(icon!=null) {
            toastIcon.setImageDrawable(icon)
            toastIcon.visibility= View.VISIBLE
        }

        if(colorIcon && icon!=null)
            toastIcon.drawable.setColorFilter(tintColor,PorterDuff.Mode.SRC_IN)


        currentToast.apply {
            view = toastLayout
            this.duration = duration
        }

        return currentToast
    }

    }