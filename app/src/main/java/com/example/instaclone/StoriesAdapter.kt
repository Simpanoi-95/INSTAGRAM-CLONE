package com.example.instaclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_stories_item.view.*

class StoriesAdapter(val storiesList: List<Story>):RecyclerView.Adapter<StoriesAdapter.StoriesViewHolder>{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoriesViewHolder {
      var rowview=LayoutInflater.from(parent.context).inflate(R.layout.row_stories_item,parent,false)
        return StoriesViewHolder(rowview);
    }


    override fun onBindViewHolder(holder: StoriesViewHolder, position: Int) {
        val story=storiesList.get(position)
        holder.rowview.tvUSERNAME.text=story.username

    }
    override fun getItemCount(): Int {
    return storiesList.size
    }


    class StoriesViewHolder(val rowview:View):RecyclerView.ViewHolder(rowview)





}