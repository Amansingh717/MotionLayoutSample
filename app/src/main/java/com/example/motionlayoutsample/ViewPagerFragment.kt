package com.example.motionlayoutsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.example.motionlayoutsample.databinding.FragmentViewPagerBinding
import com.example.motionlayoutsample.pages.PageEveningFragment
import com.example.motionlayoutsample.pages.PageMorningFragment
import com.example.motionlayoutsample.pages.PageNoonFragment

class ViewPagerFragment : Fragment() {
    lateinit var mBinding: FragmentViewPagerBinding
    lateinit var adapter: FragmentStateAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentViewPagerBinding.inflate(layoutInflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        adapter = object : FragmentStateAdapter(this) {
            override fun getItemCount(): Int {
                return PAGE_COUNT
            }

            override fun createFragment(position: Int): Fragment {
                return when (position) {
                    0 -> PageMorningFragment()
                    1 -> PageNoonFragment()
                    else -> PageEveningFragment()
                }
            }
        }
        setupViewPager()
    }

    private fun setupViewPager() {
        mBinding.viewPager.isUserInputEnabled = true
        mBinding.viewPager.adapter = adapter
        mBinding.viewPager.registerOnPageChangeCallback(onPageChangeCallback)
    }


    private var onPageChangeCallback = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageScrolled(
            position: Int,
            positionOffset: Float,
            positionOffsetPixels: Int
        ) {
            super.onPageScrolled(position, positionOffset, positionOffsetPixels)
            val progress = (position + positionOffset) / (adapter.itemCount - 1)
            mBinding.motionContainer.progress = progress
        }
    }

    companion object {
        const val PAGE_COUNT = 3
    }
}