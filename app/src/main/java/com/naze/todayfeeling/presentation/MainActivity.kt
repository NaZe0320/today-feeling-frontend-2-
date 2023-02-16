package com.naze.todayfeeling.presentation

import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.NavigationUI.setupWithNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.naze.todayfeeling.R
import com.naze.todayfeeling.databinding.ActivityMainBinding
import com.naze.todayfeeling.util.BindingActivity

class MainActivity : BindingActivity<ActivityMainBinding>(R.layout.activity_main) {

    private val viewModel: MainViewModel by viewModels()
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding.lifecycleOwner = this

        initLayout()
        initNavigation()
    }

    private fun initLayout() {

    }

    private fun initNavigation() {
        navController = Navigation.findNavController(this,R.id.main_nav_host_fragment)
        setupWithNavController(binding.bottomNavigationView,navController)
    }


}