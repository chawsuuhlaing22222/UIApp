package com.codico.uiapplication.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.codico.uiapplication.R
import com.codico.uiapplication.viewholders.ByRateViewHolder

class ByRateAdapter: RecyclerView.Adapter<ByRateViewHolder>() {
   //private var mData:List<Int> = listOf()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ByRateViewHolder {

        var view= LayoutInflater.from(parent.context).inflate(R.layout.view_holder_by_rate,parent,false)
        return ByRateViewHolder(view)
    }

    override fun onBindViewHolder(holder: ByRateViewHolder, position: Int) {

       /* var res = mData.get(position)
        res?.let {
            holder.bindData(res)
        }*/
    }

    override fun getItemCount(): Int {
        return 4
    }

    /*fun setNewData(data:List<Int>){
        mData = data
        notifyDataSetChanged()
    }*/
}