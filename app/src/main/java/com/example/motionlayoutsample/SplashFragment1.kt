package com.example.motionlayoutsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.motionlayoutsample.databinding.FragmentSplash1Binding

class SplashFragment1 : Fragment() {

    lateinit var mBinding: FragmentSplash1Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentSplash1Binding.inflate(inflater, container, false)
        return mBinding.root
    }
}