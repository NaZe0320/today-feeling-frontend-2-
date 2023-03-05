package com.naze.todayfeeling.presentation.writing

import android.os.Bundle
import com.naze.todayfeeling.R
import com.naze.todayfeeling.databinding.ActivityWritingBinding
import com.naze.todayfeeling.util.RecordFragmentAdapter
import com.naze.todayfeeling.util.binding.BindingActivity

class RecordActivity : BindingActivity<ActivityWritingBinding>(R.layout.activity_writing) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initLayout()
    }

    private fun initLayout() {
        binding.viewPager.adapter = RecordFragmentAdapter(this)

    }
}