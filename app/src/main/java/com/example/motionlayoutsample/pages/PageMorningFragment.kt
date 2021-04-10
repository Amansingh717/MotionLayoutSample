package com.example.motionlayoutsample.pages

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.motionlayoutsample.databinding.FragmentPageMorningBinding

class PageMorningFragment : Fragment() {

    lateinit var mBinding: FragmentPageMorningBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentPageMorningBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }
}