package com.technzone.toasterlibrary

import android.content.Context
import android.widget.Toast

open class ToasterMessage {

    companion object {
        fun show(context: Context, message: String) {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }
}
