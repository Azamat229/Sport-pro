package com.example.test_sportpro.utils

import android.view.View
import com.google.android.material.snackbar.Snackbar

fun View.snackbar(message: String) {

    Snackbar.make(this, message, Snackbar.LENGTH_LONG).also { snackbar ->
        snackbar.setAction("Ok") {
            snackbar.dismiss()
        }
    }.show()
}