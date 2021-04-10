package com.example.motionlayoutsample.recycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.motionlayoutsample.databinding.CustomRecyclerItemBinding

class CustomRecyclerAdapter :
    RecyclerView.Adapter<CustomRecyclerAdapter.CustomRecyclerViewHolder>() {

    var itemsList = arrayListOf<RecyclerItem>()

    class CustomRecyclerViewHolder(private val itemBinding: CustomRecyclerItemBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {
        fun bind(item: RecyclerItem) {

            Glide.with(itemBinding.root.context)
                .load(item.image)
                .into(itemBinding.imageRecyclerView)

            itemBinding.root.setOnClickListener {
                item.selected =
                    if (item.selected == true) {
                        itemBinding.containerRecyclerItem.progress = 0f
                        false
                    } else {
                        itemBinding.containerRecyclerItem.progress = 1f
                        true
                    }
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomRecyclerViewHolder {
        val binding = CustomRecyclerItemBinding.inflate(
            LayoutInflater.from(parent.context),
            parent,
            false
        )
        return CustomRecyclerViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CustomRecyclerViewHolder, position: Int) {
        holder.bind(item = itemsList[position])
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }
}