package com.example.motionlayoutsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.motionlayoutsample.databinding.FragmentSplash3Binding

class SplashFragment3 : Fragment() {
    lateinit var mBinding: FragmentSplash3Binding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentSplash3Binding.inflate(inflater, container, false)
        return mBinding.root
    }
}