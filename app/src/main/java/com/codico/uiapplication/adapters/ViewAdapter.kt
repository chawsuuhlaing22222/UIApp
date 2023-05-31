package com.codico.uiapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codico.uiapplication.R
import com.codico.uiapplication.viewholders.RestaurantViewHolder
import kotlinx.android.synthetic.main.view_holder_views.view.*

class ViewAdapter: RecyclerView.Adapter<RestaurantViewHolder>() {
   private var mData:List<Int> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {

        var view= LayoutInflater.from(parent.context).inflate(R.layout.view_holder_views,parent,false)
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {

        var res = mData.get(position)
        res?.let {
          holder.itemView.ivRestView.setImageResource(res)
        }
    }

    override fun getItemCount(): Int {
        return mData.size
    }

    fun setNewData(data:List<Int>){
        mData = data
        notifyDataSetChanged()
    }
}