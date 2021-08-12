package com.example.baseapp.ui.fragment.splash

import com.example.baseapp.base.architecture.BaseViewModel
import com.example.baseapp.base.model.NavigationModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : BaseViewModel() {

    private val SPLASH_TIME = 2000L

    init {
        launchAsync(block = {
            delay(SPLASH_TIME)
            navEvent.value =
                NavigationModel(SplashFragmentDirections.actionSplashFragmentToLoginFragment())
        })
    }
}