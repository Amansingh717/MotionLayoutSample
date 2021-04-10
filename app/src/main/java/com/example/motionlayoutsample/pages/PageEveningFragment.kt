package com.example.motionlayoutsample.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.motionlayoutsample.databinding.FragmentPageEveningBinding

class PageEveningFragment : Fragment() {

    lateinit var mBinding: FragmentPageEveningBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentPageEveningBinding.inflate(inflater, container, false)
        return mBinding.root
    }
}