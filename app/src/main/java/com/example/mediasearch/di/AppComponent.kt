package com.example.mediasearch.di

import android.app.Application
import com.example.mediasearch.ui.activity.MainActivity

import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [AppModule::class, ViewModelModule::class]
)
@Suppress("TooManyFunctions")
interface AppComponent {

    fun getApplication(): Application


    fun inject(mainActivity: MainActivity)

}