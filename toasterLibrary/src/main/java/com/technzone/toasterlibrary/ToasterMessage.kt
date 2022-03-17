package com.technzone.toasterlibrary

import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import com.technzone.toasterlibrary.databinding.CustemToastViewBinding
import com.technzone.toasterlibrary.utils.dpToPixels


open class ToasterMessage private constructor(
    private var builder: Builder,
) {
    private var context: Context? = null
    private var message: String? = null
    private var cornerRadius: Int? = null
    private var successIcon: Int? = null
    private var fieldIcon: Int? = null
    private var backgroundSuccessColor: Int? = null
    private var backgroundSuccessField: Int? = null
    private var duration: Int
    private var gravityOfMessage: Int
    private val binding: CustemToastViewBinding = DataBindingUtil.inflate(
        LayoutInflater.from(builder.getContext()),
        R.layout.custem_toast_view,
        null,
        false
    )


    init {
        context = builder.getContext()
        message = builder.getMessage()
        cornerRadius = builder.getCornerRadius()
        successIcon = builder.getSuccessIcon()
        fieldIcon = builder.getFieldIcon()
        gravityOfMessage = builder.getGravityOfMessage()
        duration = builder.getsDuration()
        backgroundSuccessColor = builder.getSuccessBackgroundColor()
        backgroundSuccessField = builder.getFieldBackgroundColor()
    }


    fun showMessage() {

        val toast = Toast(context)

        fieldIcon?.let { binding.imgToastImage.setImageResource(it) }

        backgroundSuccessField?.let {
            binding.clToast.setBackgroundColor(
                ContextCompat.getColor(
                    context!!, it
                )
            )
        }

        backgroundSuccessColor?.let {
            binding.clToast.setBackgroundColor(
                ContextCompat.getColor(
                    context!!, it
                )
            )
        }

        cornerRadius?.let {
            binding.cvToast.radius = context?.let { it1 -> it.dpToPixels(it1) }!!
        }

        binding.tvToastMessage.text = message
        toast.view = binding.root
        toast.setGravity(
            Gravity.FILL_HORIZONTAL or gravityOfMessage,
            0,
            0
        )




        toast.duration = duration
        toast.show()
    }


    class Builder {
        private var context: Context? = null
        private var message: String? = null
        private var gravityOfMessage: Int = Gravity.BOTTOM
        private var duration: Int = Toast.LENGTH_SHORT
        private var cornerRadius: Int? = null
        private var successIcon: Int? = R.drawable.ic_check
        private var fieldIcon: Int? = R.drawable.ic_close
        private var backgroundColorSuccess: Int? = null
        private var backgroundColorField: Int? = null

        fun setGravityOfMessage(gravityOfMessage: Int): Builder {
            this.gravityOfMessage = gravityOfMessage
            return this
        }

        fun getGravityOfMessage(): Int {
            return gravityOfMessage
        }

        fun setDuration(duration: Int): Builder {
            this.duration = duration
            return this
        }

        fun getsDuration(): Int {
            return duration
        }

        fun setContext(context: Context): Builder {
            this.context = context
            return this
        }

        fun getSuccessBackgroundColor(): Int? {
            return backgroundColorSuccess
        }

        fun setSuccessBackgroundColor(backgroundColorSuccess: Int): Builder {
            this.backgroundColorSuccess = backgroundColorSuccess
            return this
        }

        fun getFieldBackgroundColor(): Int? {
            return backgroundColorField
        }

        fun setFieldBackgroundColor(backgroundColorField: Int): Builder {
            this.backgroundColorField = backgroundColorField
            return this
        }

        fun getContext(): Context? {
            return context
        }

        fun setFieldIcon(fieldIcon: Int): Builder {
            this.fieldIcon = fieldIcon
            return this
        }

        fun getFieldIcon(): Int? {
            return fieldIcon
        }

        fun setSuccessIcon(successIcon: Int): Builder {
            this.successIcon = successIcon
            return this
        }

        fun getSuccessIcon(): Int? {
            return successIcon
        }


        fun setCornerRadius(cornerRadius: Int): Builder {
            this.cornerRadius = cornerRadius
            return this
        }

        fun getCornerRadius(): Int? {
            return cornerRadius
        }

        fun getMessage(): String? {
            return message
        }

        fun setMessage(message: String): Builder {
            this.message = message
            return this
        }

        fun build(): ToasterMessage {
            return ToasterMessage(this)
        }


    }


}
