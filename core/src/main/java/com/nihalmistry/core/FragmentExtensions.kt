package com.nihalmistry.core

import androidx.fragment.app.Fragment
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController

fun Fragment.getParentNavController(): NavController? {
    val currentHost = parentFragment
    val parentHost = currentHost?.parentFragment
    return parentHost?.findNavController()
}