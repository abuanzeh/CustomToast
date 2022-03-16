package com.technzone.firstlibrary

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.technzone.toasterlibrary.ToasterMessage

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ToasterMessage.showErrorMessage(this , "ERROR")
        ToasterMessage.showSuccessMessage(this , "SUCCESS")
    }
}