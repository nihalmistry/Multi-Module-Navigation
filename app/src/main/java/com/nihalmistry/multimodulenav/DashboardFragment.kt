package com.nihalmistry.multimodulenav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.fragment_dashboard.*


class DashboardFragment : Fragment(R.layout.fragment_dashboard) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navHost = childFragmentManager.findFragmentById(R.id.dashboard_nav_host)
        val navController = navHost?.findNavController()
        navController?.let {
            bottom_nav.setupWithNavController(it)
        }
    }
}