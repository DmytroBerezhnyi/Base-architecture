package com.example.baseapp.ui.fragment.home

import androidx.fragment.app.viewModels
import com.example.baseapp.R
import com.example.baseapp.base.architecture.BaseFragment
import com.example.baseapp.databinding.HomeFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeFragmentBinding, HomeViewModel>() {

    override val vm: HomeViewModel by viewModels()

    override val layoutId = R.layout.home_fragment
}