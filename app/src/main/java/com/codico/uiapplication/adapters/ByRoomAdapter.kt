package com.codico.uiapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codico.uiapplication.R
import com.codico.uiapplication.viewholders.ByRoomViewHolder

class ByRoomAdapter: RecyclerView.Adapter<ByRoomViewHolder>() {
   //private var mData:List<Int> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ByRoomViewHolder {

        var view= LayoutInflater.from(parent.context).inflate(R.layout.view_holder_by_room,parent,false)
        return ByRoomViewHolder(view)
    }

    override fun onBindViewHolder(holder: ByRoomViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 4
    }

   /* fun setNewData(data:List<Int>){
        mData = data
        notifyDataSetChanged()
    }*/
}