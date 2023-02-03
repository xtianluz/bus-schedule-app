package com.example.busschedule.ui

import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.createSavedStateHandle
import androidx.lifecycle.viewmodel.CreationExtras
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.busschedule.BusScheduleApplication

object AppViewModelProvider {
    val Factory = viewModelFactory {
        initializer {
            BusScheduleViewModel(
                busScheduleApplication().container.busScheduleRepositoryInterface
            )
        }
    }
}

fun CreationExtras.busScheduleApplication(): BusScheduleApplication =
    (this[ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY] as BusScheduleApplication)