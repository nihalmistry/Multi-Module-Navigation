package com.nihalmistry.multimodulenav

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.NavDestination
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
            it.addOnDestinationChangedListener {
                controller, destination, arguments ->
                run {
                    when (destination.id) {
                        R.id.ordersFragment -> bottom_nav.visibility = View.VISIBLE
                        R.id.productsFragment -> bottom_nav.visibility = View.GONE
                        R.id.moreFragment -> bottom_nav.visibility = View.VISIBLE
                    }
                }
            }
        }
    }
}