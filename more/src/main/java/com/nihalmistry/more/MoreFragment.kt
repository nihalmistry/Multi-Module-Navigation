package com.nihalmistry.more

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.nihalmistry.core.getParentNavController
import kotlinx.android.synthetic.main.fragment_more.*


class MoreFragment : Fragment(R.layout.fragment_more) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_profile.setOnClickListener {
            getParentNavController()?.navigate(R.id.profile, Bundle().apply {
                putInt("testData", 123)
            })
        }
    }
}