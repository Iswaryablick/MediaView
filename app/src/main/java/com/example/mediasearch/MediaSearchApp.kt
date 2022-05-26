package com.example.mediasearch

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import com.example.mediasearch.di.AppComponent


class MediaSearchApp : Application() {

    companion object {
        lateinit var INSTANCE: MediaSearchApp
    }

    lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()
        INSTANCE = this
    }
}

val AppCompatActivity.app: MediaSearchApp
    get() = application as MediaSearchApp