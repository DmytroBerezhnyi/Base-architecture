package com.example.baseapp.ui.fragment.forget_login

import androidx.fragment.app.viewModels
import com.example.baseapp.R
import com.example.baseapp.base.architecture.BaseFragment
import com.example.baseapp.databinding.ForgetLoginFragmentBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ForgetLoginFragment : BaseFragment<ForgetLoginFragmentBinding, ForgetLoginViewModel>() {

    override val vm: ForgetLoginViewModel by viewModels()

    override val layoutId = R.layout.forget_login_fragment
}