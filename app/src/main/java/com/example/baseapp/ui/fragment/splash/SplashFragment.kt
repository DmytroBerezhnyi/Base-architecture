package com.example.baseapp.ui.fragment.splash

import androidx.fragment.app.viewModels
import com.example.baseapp.R
import com.example.baseapp.base.architecture.BaseFragment
import com.example.baseapp.databinding.SplashFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SplashFragment : BaseFragment<SplashFragmentBinding, SplashViewModel>() {

    override val vm: SplashViewModel by viewModels()

    override val layoutId = R.layout.splash_fragment
}