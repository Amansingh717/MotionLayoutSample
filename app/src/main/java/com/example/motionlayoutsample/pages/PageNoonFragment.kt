package com.example.motionlayoutsample.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.motionlayoutsample.databinding.FragmentPageNoonBinding

class PageNoonFragment : Fragment() {

    lateinit var mBinding: FragmentPageNoonBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentPageNoonBinding.inflate(inflater, container, false)
        return mBinding.root
    }
}