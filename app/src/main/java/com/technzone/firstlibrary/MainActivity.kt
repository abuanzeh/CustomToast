package com.technzone.firstlibrary

import android.os.Bundle
import android.view.Gravity
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.technzone.toasterlibrary.ToasterMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

                ToasterMessage.Builder()
                    .setContext(this)
                    .setMessage("YOUR MESSAGE HERE")
                    .setFieldBackgroundColor(com.technzone.toasterlibrary.R.color.red)
                    .setCornerRadius(50) //  set custom corner radius if you want
                    .setFieldIcon(com.technzone.toasterlibrary.R.drawable.ic_close) // set success custom image
                    .setDuration(Toast.LENGTH_SHORT) // Message display time Toast.LENGTH_SHORT or Toast.LENGTH_LONG
                    .build()
                    .showMessage()
    }
}