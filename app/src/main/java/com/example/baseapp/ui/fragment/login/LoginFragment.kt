package com.example.baseapp.ui.fragment.login

import androidx.fragment.app.viewModels
import com.example.baseapp.R
import com.example.baseapp.base.architecture.BaseFragment
import com.example.baseapp.databinding.LoginFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment<LoginFragmentBinding, LoginViewModel>() {

    override val vm: LoginViewModel by viewModels()

    override val layoutId = R.layout.login_fragment
}