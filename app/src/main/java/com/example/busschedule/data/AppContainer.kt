package com.example.busschedule.data

import android.content.Context

interface AppContainerInterface {
    val busScheduleRepositoryInterface: BusScheduleRepositoryInterface
}

class AppContainerClass(context: Context) : AppContainerInterface{
    override val busScheduleRepositoryInterface: BusScheduleRepositoryInterface by lazy{
        BusScheduleRepositoryClass(BusScheduleDatabase.getDatabase(context).busScheduleDao())
    }
}