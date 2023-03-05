package com.naze.todayfeeling.util

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.naze.todayfeeling.presentation.writing.RecordFragment1
import com.naze.todayfeeling.presentation.writing.RecordFragment2
import com.naze.todayfeeling.presentation.writing.RecordFragment3

class RecordFragmentAdapter(fragment: FragmentActivity): FragmentStateAdapter(fragment) {

    private val fragmentList = listOf<Fragment>( RecordFragment1(), RecordFragment2(), RecordFragment3())

    override fun getItemCount() : Int{
        return fragmentList.size
    }

    override fun createFragment(position: Int): Fragment {
        return fragmentList[position]
    }
}