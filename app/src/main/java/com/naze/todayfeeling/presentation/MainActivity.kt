package com.naze.todayfeeling.presentation

import android.os.Bundle
import androidx.activity.viewModels
import com.naze.todayfeeling.R
import com.naze.todayfeeling.databinding.ActivityMainBinding
import com.naze.todayfeeling.util.BindingActivity

class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this

        initLayout()
    }

    private fun initLayout() {

    }

}