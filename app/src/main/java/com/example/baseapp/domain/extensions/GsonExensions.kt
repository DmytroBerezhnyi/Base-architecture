package com.example.baseapp.domain.extensions

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.reflect.TypeToken
import org.json.JSONObject

fun Any.toJson(): String {
    val gson: Gson = GsonBuilder()
        .setLenient()
        .serializeSpecialFloatingPointValues()
        .create()
    return gson.toJson(this)
}

inline fun <reified T> String.fromJson(): T = Gson().fromJson(this, object : TypeToken<T>() {}.type)

fun String.fromJsonToMap(): Map<String, Any> {
    var result = mutableMapOf<String, Any>()
    result = Gson().fromJson(this, result.javaClass)
    return result
}

fun JSONObject.getNullableString(name: String): String? {
    return if (isNull(name)) null else getString(name)
}

fun JSONObject.getNullableDouble(name: String): Double? {
    return if (isNull(name)) null else getDouble(name)
}

fun JSONObject.getNullableBoolean(name: String): Boolean? {
    return if (isNull(name)) null else getBoolean(name)
}

fun JSONObject.getNullableInt(name: String): Int? {
    return if (isNull(name)) null else getInt(name)
}