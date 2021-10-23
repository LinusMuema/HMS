package com.hack.hms.features.home

import androidx.lifecycle.*
import com.hack.hms.remote.ApiEndpoints
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewmodel @Inject constructor(val api: ApiEndpoints): ViewModel() {
}