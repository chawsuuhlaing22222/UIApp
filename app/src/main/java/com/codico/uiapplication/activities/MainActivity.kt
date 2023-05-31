package com.codico.uiapplication.activities

import android.graphics.Rect
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.codico.uiapplication.R
import com.codico.uiapplication.adapters.ByRateAdapter
import com.codico.uiapplication.adapters.ByRoomAdapter
import com.codico.uiapplication.adapters.ViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setUpRecycler()
        setUpListener()
    }

    private fun setUpListener() {
        tvByRoom.setOnClickListener {
            it.setBackgroundResource(R.drawable.bg_selected_btn_room_rate)
            tvByRate.setBackgroundResource(R.drawable.bg_unselect_btn_room_rate)
            rvByRoom.visibility=View.VISIBLE
            rvByRate.visibility=View.GONE
        }

        tvByRate.setOnClickListener {
            it.setBackgroundResource(R.drawable.bg_selected_btn_room_rate)
            tvByRoom.setBackgroundResource(R.drawable.bg_unselect_btn_room_rate)
            rvByRoom.visibility=View.GONE
            rvByRate.visibility=View.VISIBLE
        }
    }

    private fun setUpRecycler() {
        var mAdapter = ViewAdapter()
        var imglist= listOf<Int>(R.drawable.view1,R.drawable.view2,R.drawable.view3)
        rvViews.apply {
            adapter=mAdapter
            mAdapter.setNewData(imglist)
            layoutManager=
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.HORIZONTAL,false)
            addItemDecoration(object : RecyclerView.ItemDecoration(){
                override fun getItemOffsets(
                    outRect: Rect,
                    view: View,
                    parent: RecyclerView,
                    state: RecyclerView.State
                ) {
                    super.getItemOffsets(outRect, view, parent, state)
                    outRect.left =20
                }
            })
        }

        rvByRoom.apply {
            adapter=ByRoomAdapter()
            layoutManager=
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL,false)
            addItemDecoration(object : RecyclerView.ItemDecoration(){
                override fun getItemOffsets(
                    outRect: Rect,
                    view: View,
                    parent: RecyclerView,
                    state: RecyclerView.State
                ) {
                    super.getItemOffsets(outRect, view, parent, state)
                    outRect.top =40
                }
            })
        }

        rvByRate.apply {
            adapter=ByRateAdapter()
            layoutManager=
                LinearLayoutManager(this@MainActivity, LinearLayoutManager.VERTICAL,false)
            addItemDecoration(object : RecyclerView.ItemDecoration(){
                override fun getItemOffsets(
                    outRect: Rect,
                    view: View,
                    parent: RecyclerView,
                    state: RecyclerView.State
                ) {
                    super.getItemOffsets(outRect, view, parent, state)
                    outRect.top =40
                }
            })
        }

    }
}