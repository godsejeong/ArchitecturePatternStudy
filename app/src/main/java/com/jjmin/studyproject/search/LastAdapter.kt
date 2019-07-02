package com.jjmin.studyproject.search

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.jjmin.studyproject.R

class LastAdapter : ListAdapter<String, RecyclerView.ViewHolder>(itemCallback){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.list_item,
                parent,
                false
            )
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as ViewHolder).tv.text = getItem(position) as String
    }


    class ViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        var tv = view.findViewById(R.id.itemTv) as TextView
    }

    companion object {
        val itemCallback = object : DiffUtil.ItemCallback<String>() {
            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
                Log.e("Item","old : $oldItem  new : $newItem")
                return oldItem == newItem
            }
        }
    }
}

