package com.example.baseapp.ui.activity

import androidx.activity.viewModels
import com.example.baseapp.R
import com.example.baseapp.base.architecture.BaseActivity
import com.example.baseapp.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding, MainVM>() {

    override val vm: MainVM by viewModels()

    override val layoutId: Int = R.layout.activity_main
}