package com.example.busschedule

import android.app.Application
import com.example.busschedule.data.AppContainerClass
import com.example.busschedule.data.AppContainerInterface
import com.example.busschedule.data.BusScheduleDatabase

class BusScheduleApplication: Application() {
    lateinit var container: AppContainerInterface

    override fun onCreate() {
        super.onCreate()
        container = AppContainerClass(this)
    }
}