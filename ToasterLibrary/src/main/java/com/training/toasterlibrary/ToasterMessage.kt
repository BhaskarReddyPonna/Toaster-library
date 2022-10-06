package com.training.toasterlibrary

import android.content.Context
import android.widget.Toast


class ToasterMessage {

    fun toaster(c: Context, message: String) {
        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()
    }
}