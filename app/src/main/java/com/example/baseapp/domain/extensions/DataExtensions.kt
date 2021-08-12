package com.example.baseapp.domain.extensions

import android.util.Base64

fun ByteArray.toBase64(): String {
    return Base64.encodeToString(this, Base64.NO_WRAP)
}

fun String.fromBase64(): ByteArray {
    return Base64.decode(toByteArray(), Base64.NO_WRAP)
}