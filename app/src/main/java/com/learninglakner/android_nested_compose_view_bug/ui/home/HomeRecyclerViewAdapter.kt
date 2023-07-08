package com.learninglakner.android_nested_compose_view_bug.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.learninglakner.android_nested_compose_view_bug.databinding.HomeRecyclerViewItemBinding

class HomeRecyclerViewAdapter(private val dataSet: List<String>) :
    RecyclerView.Adapter<HomeRecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(val binding: HomeRecyclerViewItemBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val binding = HomeRecyclerViewItemBinding.inflate(
            LayoutInflater.from(viewGroup.context),
            viewGroup,
            false
        )

        return ViewHolder(binding)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.binding.textView.text = dataSet[position]
    }

    override fun getItemCount() = dataSet.size
}