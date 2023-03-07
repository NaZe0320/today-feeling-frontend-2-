package com.naze.todayfeeling.util

import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.naze.todayfeeling.presentation.Record.RecordFragment1

class RecordFragmentAdapter(fragment: FragmentActivity): FragmentStateAdapter(fragment) {

    val fragmentList = mutableListOf<Fragment>(RecordFragment1())

    override fun getItemCount() : Int{
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        Log.d("Fragment Test","${position}")
        return fragmentList[position]
    }
}