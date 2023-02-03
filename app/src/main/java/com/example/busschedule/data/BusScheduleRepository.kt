package com.example.busschedule.data

import kotlinx.coroutines.flow.Flow

interface BusScheduleRepositoryInterface{
    fun getAllItems() : Flow<List<BusSchedule>>

    fun getStopName(stopName: String) : Flow<List<BusSchedule>>
}

class BusScheduleRepositoryClass(private val busScheduleDao: BusScheduleDao): BusScheduleRepositoryInterface{
    override fun getAllItems(): Flow<List<BusSchedule>> = busScheduleDao.getAllItems()

    override fun getStopName(stopName: String): Flow<List<BusSchedule>> = busScheduleDao.getStopName(stopName)
}