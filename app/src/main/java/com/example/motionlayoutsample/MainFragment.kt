package com.example.motionlayoutsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.motionlayoutsample.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    lateinit var mBinding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentMainBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupClickListeners()
    }

    private fun setupClickListeners() {
        mBinding.apply {
            tvViewPager.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_viewPagerFragment)
            }
            tvSplash1.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_splash1Fragment)
            }
            tvSplash2.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_splashFragment2)
            }
            tvSplash3.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_splashFragment3)
            }
            tvRecyclerView.setOnClickListener {
                findNavController().navigate(R.id.action_mainFragment_to_splashFragment4)
            }
        }
    }
}