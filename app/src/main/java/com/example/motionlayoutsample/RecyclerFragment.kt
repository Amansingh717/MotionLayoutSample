package com.example.motionlayoutsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.motionlayoutsample.databinding.FragmentRecyclerBinding
import com.example.motionlayoutsample.recycler.CustomRecyclerAdapter
import com.example.motionlayoutsample.recycler.RecyclerItem

class RecyclerFragment : Fragment() {
    lateinit var mBinding: FragmentRecyclerBinding
    lateinit var mAdapter: CustomRecyclerAdapter
    lateinit var mLayoutManager: StaggeredGridLayoutManager
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        mBinding = FragmentRecyclerBinding.inflate(inflater, container, false)
        return mBinding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        initializeData()
    }

    private fun initializeData() {
        val list = mutableListOf<RecyclerItem>(
            RecyclerItem("http://placeimg.com/600/400/any", false),
            RecyclerItem("http://placeimg.com/610/480/any", false),
            RecyclerItem("http://placeimg.com/620/480/any", false),
            RecyclerItem("http://placeimg.com/630/480/any", false),
            RecyclerItem("http://placeimg.com/640/480/any", false),
            RecyclerItem("http://placeimg.com/650/480/any", false),
            RecyclerItem("http://placeimg.com/660/480/any", false),
            RecyclerItem("http://placeimg.com/670/480/any", false),
            RecyclerItem("http://placeimg.com/680/480/any", false),
            RecyclerItem("http://placeimg.com/690/480/any", false)
        )
        mAdapter.itemsList.addAll(list)
        mAdapter.notifyDataSetChanged()
    }

    private fun setupRecyclerView() {
        mAdapter = CustomRecyclerAdapter()
        mLayoutManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        mBinding.recyclerView.apply {
            adapter = mAdapter
            layoutManager = mLayoutManager
        }
    }
}