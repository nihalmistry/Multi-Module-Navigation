package com.nihalmistry.multimodulenav

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.fragment_dashboard.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       /* val navHost = supportFragmentManager.findFragmentById(R.id.dashboard_nav_host)
        val navController = navHost?.findNavController()
        navController?.let {
            bottom_nav.setupWithNavController(it)
        }*/
    }
}