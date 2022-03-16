package com.technzone.toasterlibrary

import android.content.Context
import android.graphics.Color
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast


open class ToasterMessage {

    companion object {
        fun showErrorMessage(context: Context, message: String) {
            val toast = Toast(context)
            val view: View = LayoutInflater.from(context).inflate(R.layout.custem_toast_view, null)
            val textView = view.findViewById(R.id.tvToast) as TextView
            textView.text = message
            toast.view = view
            toast.setGravity(
                Gravity.FILL_HORIZONTAL or Gravity.BOTTOM,
                0,
                0
            )
            toast.duration = Toast.LENGTH_LONG
            toast.show()
        }

        fun showSuccessMessage(context: Context, message: String) {
            val toast = Toast(context)
            val view: View = LayoutInflater.from(context).inflate(R.layout.custem_toast_view, null)
            val textView = view.findViewById(R.id.tvToast) as TextView
            val linearLayout = view.findViewById(R.id.LinearLayout) as LinearLayout
            linearLayout.setBackgroundColor(Color.parseColor("#4CAF50"))
            textView.text = message
            toast.view = view
            toast.setGravity(
                Gravity.FILL_HORIZONTAL or Gravity.BOTTOM,
                0,
                0
            )
            toast.duration = Toast.LENGTH_LONG
            toast.show()
        }

    }
}
