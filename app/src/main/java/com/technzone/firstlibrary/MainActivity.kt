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
            //set context
            .setContext(this)
            //set Your Message
            .setMessage("YOUR MESSAGE HERE")
            //set Text Color
            .setFieldBackgroundColor(R.color.black)
            //set custom corner radius if you want
            .setCornerRadius(10)
            // set success custom image
            .setFieldIcon(com.technzone.toasterlibrary.R.drawable.ic_check)
            // Where to display the message Gravity.TOP or Gravity.BOTTOM of screen
            .setGravityOfMessage(Gravity.BOTTOM)
            // Message display time Toast.LENGTH_SHORT or Toast.LENGTH_LONG
            .setDuration(Toast.LENGTH_SHORT)
            .build()
            .showMessage()
    }
}