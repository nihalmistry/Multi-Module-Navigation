package com.nihalmistry.multimodulenav

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.nihalmistry.core.BottomNavigationListener
import kotlinx.android.synthetic.main.fragment_dashboard.*


class DashboardFragment : Fragment(R.layout.fragment_dashboard), BottomNavigationListener {
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
                        R.id.productsFragment -> bottom_nav.visibility = View.VISIBLE
                        R.id.moreFragment -> bottom_nav.visibility = View.VISIBLE
                        R.id.pofileDetailFragment -> bottom_nav.visibility = View.VISIBLE
                    }
                }
            }
        }

    }




    override fun showBottomNavigation() {
        bottom_nav.visibility = View.VISIBLE
    }

    override fun hideBottomNavigation() {
        bottom_nav.visibility = View.GONE
    }

}